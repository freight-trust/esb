package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class GetHistoryInterchangesUuidTransactionsHandler implements Handler<RoutingContext> {

    public GetHistoryInterchangesUuidTransactionsHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        RequestParameters params = routingContext.get("parsedParameters");
        // Handle getHistoryInterchangesUuidTransactions
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}