package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/mapper")
public class Example {

    @Inject
    @RestClient
    MapperRestClient client;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, no custom exception mapper here!";
    }

    @GET
    @Path("/client")
    public String callGoodRestClient() {
        return client.hello();
    }
}