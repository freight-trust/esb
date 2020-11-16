package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class GroupControl {

  private String agencyCode;
  private Object createdAt;
  private String industryCode;
  private Long lastControlNumber;
  private String release;
  private Object updatedAt;
  private String uuid;
  private String version;
  private String localId;
  private String localIdType;
  private String remoteId;
  private String remoteIdType;
  private String type;

  public GroupControl (
    String agencyCode,
    Object createdAt,
    String industryCode,
    Long lastControlNumber,
    String release,
    Object updatedAt,
    String uuid,
    String version,
    String localId,
    String localIdType,
    String remoteId,
    String remoteIdType,
    String type
  ) {
    this.agencyCode = agencyCode;
    this.createdAt = createdAt;
    this.industryCode = industryCode;
    this.lastControlNumber = lastControlNumber;
    this.release = release;
    this.updatedAt = updatedAt;
    this.uuid = uuid;
    this.version = version;
    this.localId = localId;
    this.localIdType = localIdType;
    this.remoteId = remoteId;
    this.remoteIdType = remoteIdType;
    this.type = type;
  }

  public GroupControl(JsonObject json) {
    GroupControlConverter.fromJson(json, this);
  }

  public GroupControl(GroupControl other) {
    this.agencyCode = other.getAgencyCode();
    this.createdAt = other.getCreatedAt();
    this.industryCode = other.getIndustryCode();
    this.lastControlNumber = other.getLastControlNumber();
    this.release = other.getRelease();
    this.updatedAt = other.getUpdatedAt();
    this.uuid = other.getUuid();
    this.version = other.getVersion();
    this.localId = other.getLocalId();
    this.localIdType = other.getLocalIdType();
    this.remoteId = other.getRemoteId();
    this.remoteIdType = other.getRemoteIdType();
    this.type = other.getType();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    GroupControlConverter.toJson(this, json);
    return json;
  }

  @Fluent public GroupControl setAgencyCode(String agencyCode){
    this.agencyCode = agencyCode;
    return this;
  }
  public String getAgencyCode() {
    return this.agencyCode;
  }

  @Fluent public GroupControl setCreatedAt(Object createdAt){
    this.createdAt = createdAt;
    return this;
  }
  public Object getCreatedAt() {
    return this.createdAt;
  }

  @Fluent public GroupControl setIndustryCode(String industryCode){
    this.industryCode = industryCode;
    return this;
  }
  public String getIndustryCode() {
    return this.industryCode;
  }

  @Fluent public GroupControl setLastControlNumber(Long lastControlNumber){
    this.lastControlNumber = lastControlNumber;
    return this;
  }
  public Long getLastControlNumber() {
    return this.lastControlNumber;
  }

  @Fluent public GroupControl setRelease(String release){
    this.release = release;
    return this;
  }
  public String getRelease() {
    return this.release;
  }

  @Fluent public GroupControl setUpdatedAt(Object updatedAt){
    this.updatedAt = updatedAt;
    return this;
  }
  public Object getUpdatedAt() {
    return this.updatedAt;
  }

  @Fluent public GroupControl setUuid(String uuid){
    this.uuid = uuid;
    return this;
  }
  public String getUuid() {
    return this.uuid;
  }

  @Fluent public GroupControl setVersion(String version){
    this.version = version;
    return this;
  }
  public String getVersion() {
    return this.version;
  }

  @Fluent public GroupControl setLocalId(String localId){
    this.localId = localId;
    return this;
  }
  public String getLocalId() {
    return this.localId;
  }

  @Fluent public GroupControl setLocalIdType(String localIdType){
    this.localIdType = localIdType;
    return this;
  }
  public String getLocalIdType() {
    return this.localIdType;
  }

  @Fluent public GroupControl setRemoteId(String remoteId){
    this.remoteId = remoteId;
    return this;
  }
  public String getRemoteId() {
    return this.remoteId;
  }

  @Fluent public GroupControl setRemoteIdType(String remoteIdType){
    this.remoteIdType = remoteIdType;
    return this;
  }
  public String getRemoteIdType() {
    return this.remoteIdType;
  }

  @Fluent public GroupControl setType(String type){
    this.type = type;
    return this;
  }
  public String getType() {
    return this.type;
  }

}