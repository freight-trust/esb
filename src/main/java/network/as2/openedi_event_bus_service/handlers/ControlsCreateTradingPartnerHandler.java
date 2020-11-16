package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class ControlsCreateTradingPartnerHandler implements Handler<RoutingContext> {

    public ControlsCreateTradingPartnerHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        // Handle controls.create-tradingPartner
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}