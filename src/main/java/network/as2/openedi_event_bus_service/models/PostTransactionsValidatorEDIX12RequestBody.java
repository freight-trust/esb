package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class PostTransactionsValidatorEDIX12RequestBody {


  public PostTransactionsValidatorEDIX12RequestBody (
  ) {
  }

  public PostTransactionsValidatorEDIX12RequestBody(JsonObject json) {
    PostTransactionsValidatorEDIX12RequestBodyConverter.fromJson(json, this);
  }

  public PostTransactionsValidatorEDIX12RequestBody(PostTransactionsValidatorEDIX12RequestBody other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PostTransactionsValidatorEDIX12RequestBodyConverter.toJson(this, json);
    return json;
  }

}