package network.as2.openedi_event_bus_service;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.MessageConsumer;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory;
import io.vertx.ext.web.Router;
import io.vertx.core.Future;
import io.vertx.serviceproxy.ServiceBinder;

import network.as2.openedi_event_bus_service.services.*;
import network.as2.openedi_event_bus_service.handlers.*;
import network.as2.openedi_event_bus_service.models.*;

import java.util.List;

public class MainVerticle extends AbstractVerticle {

  HttpServer server;
  ServiceBinder serviceBinder;

  List<MessageConsumer<JsonObject>> registeredConsumers;

  /**
   * This method starts all services
   */
  private void startServices() {
    this.serviceBinder = new ServiceBinder(vertx);
    this.registeredConsumers = new ArrayList<>();

  }

  /**
   * This method constructs the router factory, mounts services and handlers and starts the http server with built router
   * @return
   */
  private Future<Void> startHttpServer() {
    Future<Void> future = Future.future();
    OpenAPI3RouterFactory.create(this.vertx, getClass().getResource("/openapi.yaml").getFile(), openAPI3RouterFactoryAsyncResult -> {
      if (openAPI3RouterFactoryAsyncResult.succeeded()) {
        OpenAPI3RouterFactory routerFactory = openAPI3RouterFactoryAsyncResult.result();

        // Enable automatic response when ValidationException is thrown
        routerFactory.setOptions(new RouterFactoryOptions().setMountValidationFailureHandler(true));

        // Mount services on event bus based on extensions
        routerFactory.mountServicesFromExtensions();

        routerFactory.addHandlerByOperationId("getConfigJs", new GetConfigJsHandler());
        routerFactory.addHandlerByOperationId("controls.retrieve-group-control", new ControlsRetrieveGroupControlHandler());
        routerFactory.addHandlerByOperationId("controls.update-group-control", new ControlsUpdateGroupControlHandler());
        routerFactory.addHandlerByOperationId("controls.retrieve-interchange-control", new ControlsRetrieveInterchangeControlHandler());
        routerFactory.addHandlerByOperationId("controls.update-interchange-control", new ControlsUpdateInterchangeControlHandler());
        routerFactory.addHandlerByOperationId("controls.retrieve-group-controls", new ControlsRetrieveGroupControlsHandler());
        routerFactory.addHandlerByOperationId("controls.create-group-control", new ControlsCreateGroupControlHandler());
        routerFactory.addHandlerByOperationId("controls.retrieve-partners", new ControlsRetrievePartnersHandler());
        routerFactory.addHandlerByOperationId("controls.create-tradingPartner", new ControlsCreateTradingPartnerHandler());
        routerFactory.addHandlerByOperationId("controls.retrieve-partner", new ControlsRetrievePartnerHandler());
        routerFactory.addHandlerByOperationId("controls.retrieve-interchange-controls", new ControlsRetrieveInterchangeControlsHandler());
        routerFactory.addHandlerByOperationId("controls.create-interchange-control", new ControlsCreateInterchangeControlHandler());
        routerFactory.addHandlerByOperationId("getHistoryGroupsUuid", new GetHistoryGroupsUuidHandler());
        routerFactory.addHandlerByOperationId("getHistoryGroupsUuidTransactions", new GetHistoryGroupsUuidTransactionsHandler());
        routerFactory.addHandlerByOperationId("getHistoryInterchanges", new GetHistoryInterchangesHandler());
        routerFactory.addHandlerByOperationId("getHistoryInterchangesUuid", new GetHistoryInterchangesUuidHandler());
        routerFactory.addHandlerByOperationId("getHistoryInterchangesUuidGroups", new GetHistoryInterchangesUuidGroupsHandler());
        routerFactory.addHandlerByOperationId("getHistoryInterchangesUuidRelationshipsAcknowledgement", new GetHistoryInterchangesUuidRelationshipsAcknowledgementHandler());
        routerFactory.addHandlerByOperationId("getHistoryInterchangesUuidTransactions", new GetHistoryInterchangesUuidTransactionsHandler());
        routerFactory.addHandlerByOperationId("getHistoryTransactionsUuid", new GetHistoryTransactionsUuidHandler());
        routerFactory.addHandlerByOperationId("getSchemas", new GetSchemasHandler());
        routerFactory.addHandlerByOperationId("postSchemas", new PostSchemasHandler());
        routerFactory.addHandlerByOperationId("getSchemasControl", new GetSchemasControlHandler());
        routerFactory.addHandlerByOperationId("getSchemasTransaction", new GetSchemasTransactionHandler());
        routerFactory.addHandlerByOperationId("getSchemasStandardTypeVersionFile", new GetSchemasStandardTypeVersionFileHandler());
        routerFactory.addHandlerByOperationId("deleteSchemasStandardTypeVersionFile", new DeleteSchemasStandardTypeVersionFileHandler());
        routerFactory.addHandlerByOperationId("postTransactionsInbound", new PostTransactionsInboundHandler());
        routerFactory.addHandlerByOperationId("postTransactionsOutbound", new PostTransactionsOutboundHandler());
        routerFactory.addHandlerByOperationId("postTransactionsTranslator", new PostTransactionsTranslatorHandler());
        routerFactory.addHandlerByOperationId("postTransactionsValidator", new PostTransactionsValidatorHandler());




        // Generate the router
        Router router = routerFactory.getRouter();
        server = vertx.createHttpServer(new HttpServerOptions().setPort(8080).setHost("localhost"));
        server.requestHandler(router).listen();
        future.complete();
      } else {
        // Something went wrong during router factory initialization
        future.fail(openAPI3RouterFactoryAsyncResult.cause());
      }
    });
    return future;
  }

  @Override
  public void start(Future<Void> future) {
    startServices();
    startHttpServer().setHandler(future.completer());
  }

  /**
   * This method closes the http server and unregister all services loaded to Event Bus
   */
  @Override
  public void stop(){
    this.server.close();
    registeredConsumers.forEach(c -> serviceBinder.unregister(c));
  }

}
