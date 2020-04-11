package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "mapper")
public interface MapperRestClient {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(); 
}