package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class DeleteSchemasStandardTypeVersionFileHandler implements Handler<RoutingContext> {

    public DeleteSchemasStandardTypeVersionFileHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        RequestParameters params = routingContext.get("parsedParameters");
        // Handle deleteSchemasStandardTypeVersionFile
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}