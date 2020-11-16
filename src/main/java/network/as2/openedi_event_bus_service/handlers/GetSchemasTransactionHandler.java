package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class GetSchemasTransactionHandler implements Handler<RoutingContext> {

    public GetSchemasTransactionHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        RequestParameters params = routingContext.get("parsedParameters");
        // Handle getSchemasTransaction
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}