package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class PostSchemasHandler implements Handler<RoutingContext> {

    public PostSchemasHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        // Handle postSchemas
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}