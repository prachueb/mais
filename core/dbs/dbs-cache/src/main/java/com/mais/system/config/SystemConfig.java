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

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.inject.Provider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@RequestScoped
public class SystemConfig {

  // tag::config[]
  @Inject
  @ConfigProperty(name = "dbs_host_dns", defaultValue = "dbs-cache-redis.default.svc.cluster.local")
  private String dbsHostDns;
  // end::config[]

  public String getDbsHostDNS() {
    return dbsHostDns;
  }

  // tag::config[]
  @Inject
  @ConfigProperty(name = "io_openliberty_guides_system_inDebug")
  Provider<Boolean> inDebug;
  // end::config[]

  public boolean isInDebug() {
    return inDebug.get();
  }

}
