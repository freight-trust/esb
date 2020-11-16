package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class MapStringString {


  public MapStringString (
  ) {
  }

  public MapStringString(JsonObject json) {
    MapStringStringConverter.fromJson(json, this);
  }

  public MapStringString(MapStringString other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    MapStringStringConverter.toJson(this, json);
    return json;
  }

}