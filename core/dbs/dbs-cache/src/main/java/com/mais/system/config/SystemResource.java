// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2017, 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::copyright[]
package com.mais.system.config;

// CDI
import redis.clients.jedis.Jedis;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

// JAX-RS
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

@RequestScoped
@Path("/")
public class SystemResource {

  private static Logger logger = Logger.getLogger(SystemResource.class.getName());

  // tag::config-injection[]
  @Inject
  SystemConfig systemConfig;
  // end::config-injection[]

  // http://localhost:9080/dbs-cache/properties
  @GET
  @Path("properties")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getProperties() {
    return Response.ok(System.getProperties())
            .header("X-Pod-Name", System.getenv("HOSTNAME"))
            .build();
  }

  // http://localhost:9080/dbs-cache/url/google.com
  @GET
  @Path("url/{externalUrl}")
//  @Produces(MediaType.TEXT_HTML)
  public Response getCallExternalUrl(@PathParam("externalUrl") String externalUrl) {
    try {
      URI targetUrl = new URI("http://" + externalUrl);
      return Response.temporaryRedirect(targetUrl).type(MediaType.WILDCARD).build();
    } catch (Exception e) {
      return Response.ok(externalUrl).type(MediaType.TEXT_PLAIN).build();
    }
  }

  // http://localhost:9080/dbs-cache/key/setKey/value/theValue
  @GET
  @Path("key/{key}/value/{value}")
  @Produces(MediaType.TEXT_HTML)
  public Response getSetKeypair(@PathParam("key") String key, @PathParam("value") String value) {

    String hostname = systemConfig.getDbsHostDNS();
    System.out.println(hostname);

    try {
      Jedis jedis = new Jedis(hostname, 6379);
      System.out.println("Connection to server successfully");

      //check whether server is running or not
      System.out.println("Server is running: " + jedis.ping());

      jedis.set(key, value);

      // Get the stored data and print it
      System.out.println("Key: " + key + " Value: " + jedis.get(key));

      return Response.ok("Key: " + key + " Value: " + jedis.get(key)).build();
    } catch (Exception e) {
//      e.printStackTrace();
//      return Response.status(200,"Should to run in Kubernetes.").build();
      return Response.ok("Should to run in Kubernetes!" + "<BR /><BR /> Key: " + key + " Value: " + value).build();
    }
  }

  @GET
  @Path("getallkeypair")
  @Produces(MediaType.TEXT_HTML)
  public Response getAllKeyPair() {

    String hostname = systemConfig.getDbsHostDNS();
    System.out.println(hostname);

    try {
      Jedis jedis = new Jedis(hostname, 6379);
      System.out.println("\ngetAllKeyPair\nConnection to server successfully");

      //check whether server is running or not
      System.out.println("Server is running: " + jedis.ping() + "\n");

      Set<String> names = jedis.keys("*");
      String result = "<BR />";
      java.util.Iterator<String> it = names.iterator();
      while(it.hasNext()) {
        String s = it.next();
        result = result + s + " : " + jedis.get(s) + "<BR />";
        System.out.println(s + " : " + jedis.get(s));
      }


//      AtomicReference<String> result = new AtomicReference<>("<BR />");
//      jedis.keys("*").iterator()
//              .forEachRemaining((k) -> {
//                result.set(result.get() + k + " : " + jedis.get(k) + "<BR />");
//                System.out.println(k + " : " + jedis.get(k));
//              });

      return Response.ok("Redis stored:<BR /><BR />" + result).build();
    } catch (Exception e) {
//      e.printStackTrace();
//      return Response.status(200,"Should to run in Kubernetes.").build();
      return Response.ok("Should to run in Kubernetes!").build();
    }
  }

  @GET
  @Path("hello")
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {

    //Connecting to Redis server on localhost
//    Jedis jedis = new Jedis(System.getenv("HOSTNAME"), 6379);

    String hostname = systemConfig.getDbsHostDNS();
    System.out.println(hostname);

    try {
      Jedis jedis = new Jedis(hostname, 6379);
      System.out.println("Connection to server successfully");
      //check whether server is running or not
      System.out.println("Server is running: "+jedis.ping());

      jedis.set("tutorial-name", "Redis tutorial");
      // Get the stored data and print it
      System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));

      return "Hello jedis ... : store tutorial-name as " + jedis.get("tutorial-name") + " Host URL: " + hostname;
    } catch (Exception e) {
//      e.printStackTrace();
      return "Should to run in Kubernetes!" + " \n\nhostname: " + hostname;
    }


    // Redisson
//    Config config = new Config();
//    // use single Redis server
//    config.useSingleServer().setAddress("redis://127.0.0.1:6379");
//
//    RedissonClient redisson = Redisson.create(config);
//
//    // perform operations
//
//    RBucket<String> bucket = redisson.getBucket("simpleObject");
//    bucket.set("This is object value");
//
//    RMap<String, String> map = redisson.getMap("simpleMap");
//    map.put("mapKey", "This is map value");
//
//    String objectValue = bucket.get();
//    System.out.println("stored object value: " + objectValue);
//
//    String mapValue = map.get("mapKey");
//    System.out.println("stored map value: " + mapValue);
//
//    redisson.shutdown();

//    return "Hello world!.. HO HO HO  " + objectValue + " " + mapValue;

//    return "Hello jedis ... "
    }


}
