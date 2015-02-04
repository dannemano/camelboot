package se.ithuset.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Define routes as Spring beans that extend RouteBuilder.
 * This class is just a test route.
 */
@Component
public class TestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://apa?period=4000&delay=5000").to("log:se.dbot.timer?level=INFO");
    }
}
