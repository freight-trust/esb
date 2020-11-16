package network.as2.openedi_event_bus_service.handlers;

import io.vertx.core.Handler;
import io.vertx.ext.web.api.RequestParameters;
import io.vertx.ext.web.RoutingContext;

public class GetHistoryGroupsUuidTransactionsHandler implements Handler<RoutingContext> {

    public GetHistoryGroupsUuidTransactionsHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        RequestParameters params = routingContext.get("parsedParameters");
        // Handle getHistoryGroupsUuidTransactions
        routingContext.response().setStatusCode(501).setStatusMessage("Not Implemented").end();
    }

}