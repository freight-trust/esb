package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class PostTransactionsTranslatorEDIX12RequestBody {


  public PostTransactionsTranslatorEDIX12RequestBody (
  ) {
  }

  public PostTransactionsTranslatorEDIX12RequestBody(JsonObject json) {
    PostTransactionsTranslatorEDIX12RequestBodyConverter.fromJson(json, this);
  }

  public PostTransactionsTranslatorEDIX12RequestBody(PostTransactionsTranslatorEDIX12RequestBody other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PostTransactionsTranslatorEDIX12RequestBodyConverter.toJson(this, json);
    return json;
  }

}