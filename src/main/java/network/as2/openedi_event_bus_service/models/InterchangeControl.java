package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class InterchangeControl {

  private String agencyCode;
  private Object createdAt;
  private String industryCode;
  private Long lastControlNumber;
  private String release;
  private Object updatedAt;
  private String uuid;
  private String version;
  private String componentSeparator;
  private String decimalMark;
  private String elementSeparator;
  private String localId;
  private String localIdType;
  private String releaseCharacter;
  private String remoteId;
  private String remoteIdType;
  private String repetitionSeparator;
  private String segmentTerminator;
  private String standard;
  private String testIndicator;
  private MapStringString delimiters;

  public InterchangeControl (
    String agencyCode,
    Object createdAt,
    String industryCode,
    Long lastControlNumber,
    String release,
    Object updatedAt,
    String uuid,
    String version,
    String componentSeparator,
    String decimalMark,
    String elementSeparator,
    String localId,
    String localIdType,
    String releaseCharacter,
    String remoteId,
    String remoteIdType,
    String repetitionSeparator,
    String segmentTerminator,
    String standard,
    String testIndicator,
    MapStringString delimiters
  ) {
    this.agencyCode = agencyCode;
    this.createdAt = createdAt;
    this.industryCode = industryCode;
    this.lastControlNumber = lastControlNumber;
    this.release = release;
    this.updatedAt = updatedAt;
    this.uuid = uuid;
    this.version = version;
    this.componentSeparator = componentSeparator;
    this.decimalMark = decimalMark;
    this.elementSeparator = elementSeparator;
    this.localId = localId;
    this.localIdType = localIdType;
    this.releaseCharacter = releaseCharacter;
    this.remoteId = remoteId;
    this.remoteIdType = remoteIdType;
    this.repetitionSeparator = repetitionSeparator;
    this.segmentTerminator = segmentTerminator;
    this.standard = standard;
    this.testIndicator = testIndicator;
    this.delimiters = delimiters;
  }

  public InterchangeControl(JsonObject json) {
    InterchangeControlConverter.fromJson(json, this);
  }

  public InterchangeControl(InterchangeControl other) {
    this.agencyCode = other.getAgencyCode();
    this.createdAt = other.getCreatedAt();
    this.industryCode = other.getIndustryCode();
    this.lastControlNumber = other.getLastControlNumber();
    this.release = other.getRelease();
    this.updatedAt = other.getUpdatedAt();
    this.uuid = other.getUuid();
    this.version = other.getVersion();
    this.componentSeparator = other.getComponentSeparator();
    this.decimalMark = other.getDecimalMark();
    this.elementSeparator = other.getElementSeparator();
    this.localId = other.getLocalId();
    this.localIdType = other.getLocalIdType();
    this.releaseCharacter = other.getReleaseCharacter();
    this.remoteId = other.getRemoteId();
    this.remoteIdType = other.getRemoteIdType();
    this.repetitionSeparator = other.getRepetitionSeparator();
    this.segmentTerminator = other.getSegmentTerminator();
    this.standard = other.getStandard();
    this.testIndicator = other.getTestIndicator();
    this.delimiters = other.getDelimiters();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    InterchangeControlConverter.toJson(this, json);
    return json;
  }

  @Fluent public InterchangeControl setAgencyCode(String agencyCode){
    this.agencyCode = agencyCode;
    return this;
  }
  public String getAgencyCode() {
    return this.agencyCode;
  }

  @Fluent public InterchangeControl setCreatedAt(Object createdAt){
    this.createdAt = createdAt;
    return this;
  }
  public Object getCreatedAt() {
    return this.createdAt;
  }

  @Fluent public InterchangeControl setIndustryCode(String industryCode){
    this.industryCode = industryCode;
    return this;
  }
  public String getIndustryCode() {
    return this.industryCode;
  }

  @Fluent public InterchangeControl setLastControlNumber(Long lastControlNumber){
    this.lastControlNumber = lastControlNumber;
    return this;
  }
  public Long getLastControlNumber() {
    return this.lastControlNumber;
  }

  @Fluent public InterchangeControl setRelease(String release){
    this.release = release;
    return this;
  }
  public String getRelease() {
    return this.release;
  }

  @Fluent public InterchangeControl setUpdatedAt(Object updatedAt){
    this.updatedAt = updatedAt;
    return this;
  }
  public Object getUpdatedAt() {
    return this.updatedAt;
  }

  @Fluent public InterchangeControl setUuid(String uuid){
    this.uuid = uuid;
    return this;
  }
  public String getUuid() {
    return this.uuid;
  }

  @Fluent public InterchangeControl setVersion(String version){
    this.version = version;
    return this;
  }
  public String getVersion() {
    return this.version;
  }

  @Fluent public InterchangeControl setComponentSeparator(String componentSeparator){
    this.componentSeparator = componentSeparator;
    return this;
  }
  public String getComponentSeparator() {
    return this.componentSeparator;
  }

  @Fluent public InterchangeControl setDecimalMark(String decimalMark){
    this.decimalMark = decimalMark;
    return this;
  }
  public String getDecimalMark() {
    return this.decimalMark;
  }

  @Fluent public InterchangeControl setElementSeparator(String elementSeparator){
    this.elementSeparator = elementSeparator;
    return this;
  }
  public String getElementSeparator() {
    return this.elementSeparator;
  }

  @Fluent public InterchangeControl setLocalId(String localId){
    this.localId = localId;
    return this;
  }
  public String getLocalId() {
    return this.localId;
  }

  @Fluent public InterchangeControl setLocalIdType(String localIdType){
    this.localIdType = localIdType;
    return this;
  }
  public String getLocalIdType() {
    return this.localIdType;
  }

  @Fluent public InterchangeControl setReleaseCharacter(String releaseCharacter){
    this.releaseCharacter = releaseCharacter;
    return this;
  }
  public String getReleaseCharacter() {
    return this.releaseCharacter;
  }

  @Fluent public InterchangeControl setRemoteId(String remoteId){
    this.remoteId = remoteId;
    return this;
  }
  public String getRemoteId() {
    return this.remoteId;
  }

  @Fluent public InterchangeControl setRemoteIdType(String remoteIdType){
    this.remoteIdType = remoteIdType;
    return this;
  }
  public String getRemoteIdType() {
    return this.remoteIdType;
  }

  @Fluent public InterchangeControl setRepetitionSeparator(String repetitionSeparator){
    this.repetitionSeparator = repetitionSeparator;
    return this;
  }
  public String getRepetitionSeparator() {
    return this.repetitionSeparator;
  }

  @Fluent public InterchangeControl setSegmentTerminator(String segmentTerminator){
    this.segmentTerminator = segmentTerminator;
    return this;
  }
  public String getSegmentTerminator() {
    return this.segmentTerminator;
  }

  @Fluent public InterchangeControl setStandard(String standard){
    this.standard = standard;
    return this;
  }
  public String getStandard() {
    return this.standard;
  }

  @Fluent public InterchangeControl setTestIndicator(String testIndicator){
    this.testIndicator = testIndicator;
    return this;
  }
  public String getTestIndicator() {
    return this.testIndicator;
  }

  @Fluent public InterchangeControl setDelimiters(MapStringString delimiters){
    this.delimiters = delimiters;
    return this;
  }
  public MapStringString getDelimiters() {
    return this.delimiters;
  }

}