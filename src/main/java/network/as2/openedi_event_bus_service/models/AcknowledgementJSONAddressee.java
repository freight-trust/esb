package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class AcknowledgementJSONAddressee {

  private String id;
  private String type;

  public AcknowledgementJSONAddressee (
    String id,
    String type
  ) {
    this.id = id;
    this.type = type;
  }

  public AcknowledgementJSONAddressee(JsonObject json) {
    AcknowledgementJSONAddresseeConverter.fromJson(json, this);
  }

  public AcknowledgementJSONAddressee(AcknowledgementJSONAddressee other) {
    this.id = other.getId();
    this.type = other.getType();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AcknowledgementJSONAddresseeConverter.toJson(this, json);
    return json;
  }

  @Fluent public AcknowledgementJSONAddressee setId(String id){
    this.id = id;
    return this;
  }
  public String getId() {
    return this.id;
  }

  @Fluent public AcknowledgementJSONAddressee setType(String type){
    this.type = type;
    return this;
  }
  public String getType() {
    return this.type;
  }

}