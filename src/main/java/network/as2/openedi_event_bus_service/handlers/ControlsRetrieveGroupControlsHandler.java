package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class ControlsRetrieveGroupControlsHandler implements Handler<RoutingContext> {

    public ControlsRetrieveGroupControlsHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        RequestParameters params = routingContext.get("parsedParameters");
        // Handle controls.retrieve-group-controls
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}