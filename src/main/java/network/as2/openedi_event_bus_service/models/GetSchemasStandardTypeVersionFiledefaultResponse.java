package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class GetSchemasStandardTypeVersionFiledefaultResponse {


  public GetSchemasStandardTypeVersionFiledefaultResponse (
  ) {
  }

  public GetSchemasStandardTypeVersionFiledefaultResponse(JsonObject json) {
    GetSchemasStandardTypeVersionFiledefaultResponseConverter.fromJson(json, this);
  }

  public GetSchemasStandardTypeVersionFiledefaultResponse(GetSchemasStandardTypeVersionFiledefaultResponse other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    GetSchemasStandardTypeVersionFiledefaultResponseConverter.toJson(this, json);
    return json;
  }

}