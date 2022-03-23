# Build derby database server

`$ docker build --force-rm -t prachueb/derby:10.14.2.0 rdbms-engine/derby`

`$ docker login`

`$ docker push prachueb/derby:10.14.2.0`

`$ docker run --rm --detach -p 1527:1527 --name derby prachueb/derby:10.14.2.0`

`$ docker stop derby`

## Deploy into kubernetes cluster

`$ kubectl apply -f derby-deployment.yaml`

*derby-deployment.yaml*

    apiVersion: v1
    kind: Service
    metadata:
      name: derby-service
    spec:
    #  type: NodePort
      type: ClusterIP
      ports:
        - protocol: TCP
          # The port use in the kubernetes cluster.
          port: 1527
          # Should to same to the port in pom.xml and containerPort.
          targetPort: 1527
          # Use for external call should be between 30000-32768
    #      nodePort: 31527
      selector:
        app: derby
    #  clusterIP: None
    ---
    apiVersion: apps/v1
    kind: Deployment
    metadata:
      name: derby
      labels:
        app: derby
    spec:
      replicas: 1
      selector:
        matchLabels:
          app: derby
      template:
        metadata:
          labels:
            app: derby
        spec:
          containers:
          - name: derby
            image: prachueb/derby:10.14.2.0
            lifecycle:
              preStop:
                exec:
                  command: ["java", "org.apache.derby.drda.NetworkServerControl",          					 "shutdown", "-h", "0.0.0.0"]
    ---
    apiVersion: v1
    kind: PersistentVolume
    metadata:
      name: derby-pv-volume
      labels:
        type: local
    spec:
      storageClassName: manual
      capacity:
        storage: 20Gi
      accessModes:
        - ReadWriteOnce
      hostPath:
        path: "/mnt/data"
    ---
    apiVersion: v1
    kind: PersistentVolumeClaim
    metadata:
      name: derby-pv-claim
    spec:
      storageClassName: manual
      accessModes:
        - ReadWriteOnce
      resources:
        requests:
          storage: 20Gi

---

# Application derby client
**Connect to Derby server in Kubernetes**

The *.war application using Openliberty should to place the *derby jar files* into *src/main/resources* and the *Dockerfile* should to copy these files into the docker container on build.

**Dockerfile**

    FROM icr.io/appcafe/open-liberty:full-java11-openj9-ubi
    
    COPY --chown=1001:0 src/main/resources/*.jar /opt/ol/wlp/usr/shared/resources/
    COPY --chown=1001:0 src/main/liberty/config /config/
    COPY --chown=1001:0 target/core-db-1.war /config/apps
    RUN configure.sh

---

# Derby tool

`$ docker exec -it derby /bin/sh`

`ij> HELP;`

`ij> SHOW CONNECTIONS;`

`ij> connect 'jdbc:derby://localhost:1527/myDb.db';`

`ij> CONNECT 'jdbc:derby://localhost/myDb.db;user=usr';`

`ij> SHOW CONNECTIONS;`

`ij> SHOW TABLES IN usr;`

`ij> DESCRIBE usr.CARS;`

`ij> DISCONNECT;`
