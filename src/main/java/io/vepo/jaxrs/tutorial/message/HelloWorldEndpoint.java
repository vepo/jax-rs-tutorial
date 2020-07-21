package io.vepo.jaxrs.tutorial.message;

import java.time.Instant;
import java.util.Date;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@ApplicationScoped
public class HelloWorldEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Message sayHello() {
        Message message = new Message();
        message.setContent("Hello World");
        message.setDate(Date.from(Instant.now()));
        return message;
    }
}
