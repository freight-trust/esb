package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class AcknowledgementJSONSegmentError {

  private List<AcknowledgementJSONElementError> errors;
  private Integer position;
  private String segment;
  private String type;

  public AcknowledgementJSONSegmentError (
    List<AcknowledgementJSONElementError> errors,
    Integer position,
    String segment,
    String type
  ) {
    this.errors = errors;
    this.position = position;
    this.segment = segment;
    this.type = type;
  }

  public AcknowledgementJSONSegmentError(JsonObject json) {
    AcknowledgementJSONSegmentErrorConverter.fromJson(json, this);
  }

  public AcknowledgementJSONSegmentError(AcknowledgementJSONSegmentError other) {
    this.errors = other.getErrors();
    this.position = other.getPosition();
    this.segment = other.getSegment();
    this.type = other.getType();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AcknowledgementJSONSegmentErrorConverter.toJson(this, json);
    return json;
  }

  @Fluent public AcknowledgementJSONSegmentError setErrors(List<AcknowledgementJSONElementError> errors){
    this.errors = errors;
    return this;
  }
  public List<AcknowledgementJSONElementError> getErrors() {
    return this.errors;
  }

  @Fluent public AcknowledgementJSONSegmentError setPosition(Integer position){
    this.position = position;
    return this;
  }
  public Integer getPosition() {
    return this.position;
  }

  @Fluent public AcknowledgementJSONSegmentError setSegment(String segment){
    this.segment = segment;
    return this;
  }
  public String getSegment() {
    return this.segment;
  }

  @Fluent public AcknowledgementJSONSegmentError setType(String type){
    this.type = type;
    return this;
  }
  public String getType() {
    return this.type;
  }

}