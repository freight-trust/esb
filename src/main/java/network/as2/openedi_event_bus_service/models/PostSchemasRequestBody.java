package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class PostSchemasRequestBody {

  private String standard;
  private String agencyCode;
  private String version;
  private String release;
  private String industryCode;
  private String transactionCode;
  private String senderIdType;
  private String senderId;
  private String receiverIdType;
  private String receiverId;
  private InputStream file;

  public PostSchemasRequestBody (
    String standard,
    String agencyCode,
    String version,
    String release,
    String industryCode,
    String transactionCode,
    String senderIdType,
    String senderId,
    String receiverIdType,
    String receiverId,
    InputStream file
  ) {
    this.standard = standard;
    this.agencyCode = agencyCode;
    this.version = version;
    this.release = release;
    this.industryCode = industryCode;
    this.transactionCode = transactionCode;
    this.senderIdType = senderIdType;
    this.senderId = senderId;
    this.receiverIdType = receiverIdType;
    this.receiverId = receiverId;
    this.file = file;
  }

  public PostSchemasRequestBody(JsonObject json) {
    PostSchemasRequestBodyConverter.fromJson(json, this);
  }

  public PostSchemasRequestBody(PostSchemasRequestBody other) {
    this.standard = other.getStandard();
    this.agencyCode = other.getAgencyCode();
    this.version = other.getVersion();
    this.release = other.getRelease();
    this.industryCode = other.getIndustryCode();
    this.transactionCode = other.getTransactionCode();
    this.senderIdType = other.getSenderIdType();
    this.senderId = other.getSenderId();
    this.receiverIdType = other.getReceiverIdType();
    this.receiverId = other.getReceiverId();
    this.file = other.getFile();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PostSchemasRequestBodyConverter.toJson(this, json);
    return json;
  }

  @Fluent public PostSchemasRequestBody setStandard(String standard){
    this.standard = standard;
    return this;
  }
  public String getStandard() {
    return this.standard;
  }

  @Fluent public PostSchemasRequestBody setAgencyCode(String agencyCode){
    this.agencyCode = agencyCode;
    return this;
  }
  public String getAgencyCode() {
    return this.agencyCode;
  }

  @Fluent public PostSchemasRequestBody setVersion(String version){
    this.version = version;
    return this;
  }
  public String getVersion() {
    return this.version;
  }

  @Fluent public PostSchemasRequestBody setRelease(String release){
    this.release = release;
    return this;
  }
  public String getRelease() {
    return this.release;
  }

  @Fluent public PostSchemasRequestBody setIndustryCode(String industryCode){
    this.industryCode = industryCode;
    return this;
  }
  public String getIndustryCode() {
    return this.industryCode;
  }

  @Fluent public PostSchemasRequestBody setTransactionCode(String transactionCode){
    this.transactionCode = transactionCode;
    return this;
  }
  public String getTransactionCode() {
    return this.transactionCode;
  }

  @Fluent public PostSchemasRequestBody setSenderIdType(String senderIdType){
    this.senderIdType = senderIdType;
    return this;
  }
  public String getSenderIdType() {
    return this.senderIdType;
  }

  @Fluent public PostSchemasRequestBody setSenderId(String senderId){
    this.senderId = senderId;
    return this;
  }
  public String getSenderId() {
    return this.senderId;
  }

  @Fluent public PostSchemasRequestBody setReceiverIdType(String receiverIdType){
    this.receiverIdType = receiverIdType;
    return this;
  }
  public String getReceiverIdType() {
    return this.receiverIdType;
  }

  @Fluent public PostSchemasRequestBody setReceiverId(String receiverId){
    this.receiverId = receiverId;
    return this;
  }
  public String getReceiverId() {
    return this.receiverId;
  }

  @Fluent public PostSchemasRequestBody setFile(InputStream file){
    this.file = file;
    return this;
  }
  public InputStream getFile() {
    return this.file;
  }

}