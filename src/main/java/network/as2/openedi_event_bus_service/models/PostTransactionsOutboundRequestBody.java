package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class PostTransactionsOutboundRequestBody {


  public PostTransactionsOutboundRequestBody (
  ) {
  }

  public PostTransactionsOutboundRequestBody(JsonObject json) {
    PostTransactionsOutboundRequestBodyConverter.fromJson(json, this);
  }

  public PostTransactionsOutboundRequestBody(PostTransactionsOutboundRequestBody other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PostTransactionsOutboundRequestBodyConverter.toJson(this, json);
    return json;
  }

}