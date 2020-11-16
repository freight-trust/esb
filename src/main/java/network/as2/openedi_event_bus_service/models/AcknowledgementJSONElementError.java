package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class AcknowledgementJSONElementError {

  private Integer component;
  private Integer element;
  private Integer occurrence;
  private String type;

  public AcknowledgementJSONElementError (
    Integer component,
    Integer element,
    Integer occurrence,
    String type
  ) {
    this.component = component;
    this.element = element;
    this.occurrence = occurrence;
    this.type = type;
  }

  public AcknowledgementJSONElementError(JsonObject json) {
    AcknowledgementJSONElementErrorConverter.fromJson(json, this);
  }

  public AcknowledgementJSONElementError(AcknowledgementJSONElementError other) {
    this.component = other.getComponent();
    this.element = other.getElement();
    this.occurrence = other.getOccurrence();
    this.type = other.getType();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AcknowledgementJSONElementErrorConverter.toJson(this, json);
    return json;
  }

  @Fluent public AcknowledgementJSONElementError setComponent(Integer component){
    this.component = component;
    return this;
  }
  public Integer getComponent() {
    return this.component;
  }

  @Fluent public AcknowledgementJSONElementError setElement(Integer element){
    this.element = element;
    return this;
  }
  public Integer getElement() {
    return this.element;
  }

  @Fluent public AcknowledgementJSONElementError setOccurrence(Integer occurrence){
    this.occurrence = occurrence;
    return this;
  }
  public Integer getOccurrence() {
    return this.occurrence;
  }

  @Fluent public AcknowledgementJSONElementError setType(String type){
    this.type = type;
    return this;
  }
  public String getType() {
    return this.type;
  }

}