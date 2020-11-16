package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class PostTransactionsValidatorEDIFACTRequestBody {


  public PostTransactionsValidatorEDIFACTRequestBody (
  ) {
  }

  public PostTransactionsValidatorEDIFACTRequestBody(JsonObject json) {
    PostTransactionsValidatorEDIFACTRequestBodyConverter.fromJson(json, this);
  }

  public PostTransactionsValidatorEDIFACTRequestBody(PostTransactionsValidatorEDIFACTRequestBody other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PostTransactionsValidatorEDIFACTRequestBodyConverter.toJson(this, json);
    return json;
  }

}