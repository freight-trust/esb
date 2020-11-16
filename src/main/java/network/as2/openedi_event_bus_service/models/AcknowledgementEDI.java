package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class AcknowledgementEDI {


  public AcknowledgementEDI (
  ) {
  }

  public AcknowledgementEDI(JsonObject json) {
    AcknowledgementEDIConverter.fromJson(json, this);
  }

  public AcknowledgementEDI(AcknowledgementEDI other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AcknowledgementEDIConverter.toJson(this, json);
    return json;
  }

}