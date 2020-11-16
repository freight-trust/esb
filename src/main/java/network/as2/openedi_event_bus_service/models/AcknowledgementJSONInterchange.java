package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class AcknowledgementJSONInterchange {

  private String agencyCode;
  private String controlReference;
  private List<AcknowledgementJSONSegmentError> errors;
  private String industryCode;
  private String release;
  private String version;
  private List<AcknowledgementJSONGroup> groups;
  private AcknowledgementJSONAddressee receiver;
  private AcknowledgementJSONAddressee sender;
  private List<AcknowledgementJSONTransaction> transactions;

  public AcknowledgementJSONInterchange (
    String agencyCode,
    String controlReference,
    List<AcknowledgementJSONSegmentError> errors,
    String industryCode,
    String release,
    String version,
    List<AcknowledgementJSONGroup> groups,
    AcknowledgementJSONAddressee receiver,
    AcknowledgementJSONAddressee sender,
    List<AcknowledgementJSONTransaction> transactions
  ) {
    this.agencyCode = agencyCode;
    this.controlReference = controlReference;
    this.errors = errors;
    this.industryCode = industryCode;
    this.release = release;
    this.version = version;
    this.groups = groups;
    this.receiver = receiver;
    this.sender = sender;
    this.transactions = transactions;
  }

  public AcknowledgementJSONInterchange(JsonObject json) {
    AcknowledgementJSONInterchangeConverter.fromJson(json, this);
  }

  public AcknowledgementJSONInterchange(AcknowledgementJSONInterchange other) {
    this.agencyCode = other.getAgencyCode();
    this.controlReference = other.getControlReference();
    this.errors = other.getErrors();
    this.industryCode = other.getIndustryCode();
    this.release = other.getRelease();
    this.version = other.getVersion();
    this.groups = other.getGroups();
    this.receiver = other.getReceiver();
    this.sender = other.getSender();
    this.transactions = other.getTransactions();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AcknowledgementJSONInterchangeConverter.toJson(this, json);
    return json;
  }

  @Fluent public AcknowledgementJSONInterchange setAgencyCode(String agencyCode){
    this.agencyCode = agencyCode;
    return this;
  }
  public String getAgencyCode() {
    return this.agencyCode;
  }

  @Fluent public AcknowledgementJSONInterchange setControlReference(String controlReference){
    this.controlReference = controlReference;
    return this;
  }
  public String getControlReference() {
    return this.controlReference;
  }

  @Fluent public AcknowledgementJSONInterchange setErrors(List<AcknowledgementJSONSegmentError> errors){
    this.errors = errors;
    return this;
  }
  public List<AcknowledgementJSONSegmentError> getErrors() {
    return this.errors;
  }

  @Fluent public AcknowledgementJSONInterchange setIndustryCode(String industryCode){
    this.industryCode = industryCode;
    return this;
  }
  public String getIndustryCode() {
    return this.industryCode;
  }

  @Fluent public AcknowledgementJSONInterchange setRelease(String release){
    this.release = release;
    return this;
  }
  public String getRelease() {
    return this.release;
  }

  @Fluent public AcknowledgementJSONInterchange setVersion(String version){
    this.version = version;
    return this;
  }
  public String getVersion() {
    return this.version;
  }

  @Fluent public AcknowledgementJSONInterchange setGroups(List<AcknowledgementJSONGroup> groups){
    this.groups = groups;
    return this;
  }
  public List<AcknowledgementJSONGroup> getGroups() {
    return this.groups;
  }

  @Fluent public AcknowledgementJSONInterchange setReceiver(AcknowledgementJSONAddressee receiver){
    this.receiver = receiver;
    return this;
  }
  public AcknowledgementJSONAddressee getReceiver() {
    return this.receiver;
  }

  @Fluent public AcknowledgementJSONInterchange setSender(AcknowledgementJSONAddressee sender){
    this.sender = sender;
    return this;
  }
  public AcknowledgementJSONAddressee getSender() {
    return this.sender;
  }

  @Fluent public AcknowledgementJSONInterchange setTransactions(List<AcknowledgementJSONTransaction> transactions){
    this.transactions = transactions;
    return this;
  }
  public List<AcknowledgementJSONTransaction> getTransactions() {
    return this.transactions;
  }

}