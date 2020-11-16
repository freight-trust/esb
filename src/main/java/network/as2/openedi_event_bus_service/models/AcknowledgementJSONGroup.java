package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class AcknowledgementJSONGroup {

  private String agencyCode;
  private String controlReference;
  private List<AcknowledgementJSONSegmentError> errors;
  private String industryCode;
  private String release;
  private String version;
  private AcknowledgementJSONAddressee receiver;
  private AcknowledgementJSONAddressee sender;
  private List<AcknowledgementJSONTransaction> transactions;
  private String type;

  public AcknowledgementJSONGroup (
    String agencyCode,
    String controlReference,
    List<AcknowledgementJSONSegmentError> errors,
    String industryCode,
    String release,
    String version,
    AcknowledgementJSONAddressee receiver,
    AcknowledgementJSONAddressee sender,
    List<AcknowledgementJSONTransaction> transactions,
    String type
  ) {
    this.agencyCode = agencyCode;
    this.controlReference = controlReference;
    this.errors = errors;
    this.industryCode = industryCode;
    this.release = release;
    this.version = version;
    this.receiver = receiver;
    this.sender = sender;
    this.transactions = transactions;
    this.type = type;
  }

  public AcknowledgementJSONGroup(JsonObject json) {
    AcknowledgementJSONGroupConverter.fromJson(json, this);
  }

  public AcknowledgementJSONGroup(AcknowledgementJSONGroup other) {
    this.agencyCode = other.getAgencyCode();
    this.controlReference = other.getControlReference();
    this.errors = other.getErrors();
    this.industryCode = other.getIndustryCode();
    this.release = other.getRelease();
    this.version = other.getVersion();
    this.receiver = other.getReceiver();
    this.sender = other.getSender();
    this.transactions = other.getTransactions();
    this.type = other.getType();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AcknowledgementJSONGroupConverter.toJson(this, json);
    return json;
  }

  @Fluent public AcknowledgementJSONGroup setAgencyCode(String agencyCode){
    this.agencyCode = agencyCode;
    return this;
  }
  public String getAgencyCode() {
    return this.agencyCode;
  }

  @Fluent public AcknowledgementJSONGroup setControlReference(String controlReference){
    this.controlReference = controlReference;
    return this;
  }
  public String getControlReference() {
    return this.controlReference;
  }

  @Fluent public AcknowledgementJSONGroup setErrors(List<AcknowledgementJSONSegmentError> errors){
    this.errors = errors;
    return this;
  }
  public List<AcknowledgementJSONSegmentError> getErrors() {
    return this.errors;
  }

  @Fluent public AcknowledgementJSONGroup setIndustryCode(String industryCode){
    this.industryCode = industryCode;
    return this;
  }
  public String getIndustryCode() {
    return this.industryCode;
  }

  @Fluent public AcknowledgementJSONGroup setRelease(String release){
    this.release = release;
    return this;
  }
  public String getRelease() {
    return this.release;
  }

  @Fluent public AcknowledgementJSONGroup setVersion(String version){
    this.version = version;
    return this;
  }
  public String getVersion() {
    return this.version;
  }

  @Fluent public AcknowledgementJSONGroup setReceiver(AcknowledgementJSONAddressee receiver){
    this.receiver = receiver;
    return this;
  }
  public AcknowledgementJSONAddressee getReceiver() {
    return this.receiver;
  }

  @Fluent public AcknowledgementJSONGroup setSender(AcknowledgementJSONAddressee sender){
    this.sender = sender;
    return this;
  }
  public AcknowledgementJSONAddressee getSender() {
    return this.sender;
  }

  @Fluent public AcknowledgementJSONGroup setTransactions(List<AcknowledgementJSONTransaction> transactions){
    this.transactions = transactions;
    return this;
  }
  public List<AcknowledgementJSONTransaction> getTransactions() {
    return this.transactions;
  }

  @Fluent public AcknowledgementJSONGroup setType(String type){
    this.type = type;
    return this;
  }
  public String getType() {
    return this.type;
  }

}