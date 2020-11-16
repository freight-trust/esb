package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class AcknowledgementJSONTransaction {

  private String agencyCode;
  private String controlReference;
  private List<AcknowledgementJSONSegmentError> errors;
  private String industryCode;
  private String release;
  private String version;
  private String type;

  public AcknowledgementJSONTransaction (
    String agencyCode,
    String controlReference,
    List<AcknowledgementJSONSegmentError> errors,
    String industryCode,
    String release,
    String version,
    String type
  ) {
    this.agencyCode = agencyCode;
    this.controlReference = controlReference;
    this.errors = errors;
    this.industryCode = industryCode;
    this.release = release;
    this.version = version;
    this.type = type;
  }

  public AcknowledgementJSONTransaction(JsonObject json) {
    AcknowledgementJSONTransactionConverter.fromJson(json, this);
  }

  public AcknowledgementJSONTransaction(AcknowledgementJSONTransaction other) {
    this.agencyCode = other.getAgencyCode();
    this.controlReference = other.getControlReference();
    this.errors = other.getErrors();
    this.industryCode = other.getIndustryCode();
    this.release = other.getRelease();
    this.version = other.getVersion();
    this.type = other.getType();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AcknowledgementJSONTransactionConverter.toJson(this, json);
    return json;
  }

  @Fluent public AcknowledgementJSONTransaction setAgencyCode(String agencyCode){
    this.agencyCode = agencyCode;
    return this;
  }
  public String getAgencyCode() {
    return this.agencyCode;
  }

  @Fluent public AcknowledgementJSONTransaction setControlReference(String controlReference){
    this.controlReference = controlReference;
    return this;
  }
  public String getControlReference() {
    return this.controlReference;
  }

  @Fluent public AcknowledgementJSONTransaction setErrors(List<AcknowledgementJSONSegmentError> errors){
    this.errors = errors;
    return this;
  }
  public List<AcknowledgementJSONSegmentError> getErrors() {
    return this.errors;
  }

  @Fluent public AcknowledgementJSONTransaction setIndustryCode(String industryCode){
    this.industryCode = industryCode;
    return this;
  }
  public String getIndustryCode() {
    return this.industryCode;
  }

  @Fluent public AcknowledgementJSONTransaction setRelease(String release){
    this.release = release;
    return this;
  }
  public String getRelease() {
    return this.release;
  }

  @Fluent public AcknowledgementJSONTransaction setVersion(String version){
    this.version = version;
    return this;
  }
  public String getVersion() {
    return this.version;
  }

  @Fluent public AcknowledgementJSONTransaction setType(String type){
    this.type = type;
    return this;
  }
  public String getType() {
    return this.type;
  }

}