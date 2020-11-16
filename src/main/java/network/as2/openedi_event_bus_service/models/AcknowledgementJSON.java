package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class AcknowledgementJSON {

  private List<AcknowledgementJSONInterchange> interchanges;

  public AcknowledgementJSON (
    List<AcknowledgementJSONInterchange> interchanges
  ) {
    this.interchanges = interchanges;
  }

  public AcknowledgementJSON(JsonObject json) {
    AcknowledgementJSONConverter.fromJson(json, this);
  }

  public AcknowledgementJSON(AcknowledgementJSON other) {
    this.interchanges = other.getInterchanges();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AcknowledgementJSONConverter.toJson(this, json);
    return json;
  }

  @Fluent public AcknowledgementJSON setInterchanges(List<AcknowledgementJSONInterchange> interchanges){
    this.interchanges = interchanges;
    return this;
  }
  public List<AcknowledgementJSONInterchange> getInterchanges() {
    return this.interchanges;
  }

}