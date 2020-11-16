package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class GetSchemasHandler implements Handler<RoutingContext> {

    public GetSchemasHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        // Handle getSchemas
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}