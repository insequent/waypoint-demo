package com.example.things;


import com.example.things.models.Things;
import java.util.Arrays;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;


@Path("/")
public class ThingsService {
    private final Logger logger = Logger.getLogger(getClass());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Things things() {
        return new Things() {{
            name = "socks";
            things = Arrays.asList(
                    new Thing() {{
                        color = "red";
                        description = "These are red socks";
                        count = 6;
                    }},
                    new Thing() {{
                        color = "polka-dot";
                        description = "These socks are polka dot";
                        count = 1;
                    }},
                    new Thing() {{
                        color = "black";
                        description = "These socks are all black";
                        count = 5;
                    }}
            );
        }};
    }
}
