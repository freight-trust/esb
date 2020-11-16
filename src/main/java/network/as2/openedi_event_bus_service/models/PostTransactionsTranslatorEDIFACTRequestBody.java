package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class PostTransactionsTranslatorEDIFACTRequestBody {


  public PostTransactionsTranslatorEDIFACTRequestBody (
  ) {
  }

  public PostTransactionsTranslatorEDIFACTRequestBody(JsonObject json) {
    PostTransactionsTranslatorEDIFACTRequestBodyConverter.fromJson(json, this);
  }

  public PostTransactionsTranslatorEDIFACTRequestBody(PostTransactionsTranslatorEDIFACTRequestBody other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PostTransactionsTranslatorEDIFACTRequestBodyConverter.toJson(this, json);
    return json;
  }

}