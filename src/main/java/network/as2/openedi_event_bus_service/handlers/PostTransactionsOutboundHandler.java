package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class PostTransactionsOutboundHandler implements Handler<RoutingContext> {

    public PostTransactionsOutboundHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        RequestParameters params = routingContext.get("parsedParameters");
        // Handle postTransactionsOutbound
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}