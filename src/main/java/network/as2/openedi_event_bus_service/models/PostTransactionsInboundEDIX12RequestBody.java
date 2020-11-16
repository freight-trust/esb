package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class PostTransactionsInboundEDIX12RequestBody {


  public PostTransactionsInboundEDIX12RequestBody (
  ) {
  }

  public PostTransactionsInboundEDIX12RequestBody(JsonObject json) {
    PostTransactionsInboundEDIX12RequestBodyConverter.fromJson(json, this);
  }

  public PostTransactionsInboundEDIX12RequestBody(PostTransactionsInboundEDIX12RequestBody other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PostTransactionsInboundEDIX12RequestBodyConverter.toJson(this, json);
    return json;
  }

}