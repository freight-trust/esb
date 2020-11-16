package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class InputStream {


  public InputStream (
  ) {
  }

  public InputStream(JsonObject json) {
    InputStreamConverter.fromJson(json, this);
  }

  public InputStream(InputStream other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    InputStreamConverter.toJson(this, json);
    return json;
  }

}