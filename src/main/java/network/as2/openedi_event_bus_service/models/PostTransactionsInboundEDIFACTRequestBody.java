package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class PostTransactionsInboundEDIFACTRequestBody {


  public PostTransactionsInboundEDIFACTRequestBody (
  ) {
  }

  public PostTransactionsInboundEDIFACTRequestBody(JsonObject json) {
    PostTransactionsInboundEDIFACTRequestBodyConverter.fromJson(json, this);
  }

  public PostTransactionsInboundEDIFACTRequestBody(PostTransactionsInboundEDIFACTRequestBody other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PostTransactionsInboundEDIFACTRequestBodyConverter.toJson(this, json);
    return json;
  }

}