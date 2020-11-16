package network.as2.openedi_event_bus_service.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class TradingPartner {

  private Object createdAt;
  private String name;
  private Object updatedAt;
  private String uuid;

  public TradingPartner (
    Object createdAt,
    String name,
    Object updatedAt,
    String uuid
  ) {
    this.createdAt = createdAt;
    this.name = name;
    this.updatedAt = updatedAt;
    this.uuid = uuid;
  }

  public TradingPartner(JsonObject json) {
    TradingPartnerConverter.fromJson(json, this);
  }

  public TradingPartner(TradingPartner other) {
    this.createdAt = other.getCreatedAt();
    this.name = other.getName();
    this.updatedAt = other.getUpdatedAt();
    this.uuid = other.getUuid();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    TradingPartnerConverter.toJson(this, json);
    return json;
  }

  @Fluent public TradingPartner setCreatedAt(Object createdAt){
    this.createdAt = createdAt;
    return this;
  }
  public Object getCreatedAt() {
    return this.createdAt;
  }

  @Fluent public TradingPartner setName(String name){
    this.name = name;
    return this;
  }
  public String getName() {
    return this.name;
  }

  @Fluent public TradingPartner setUpdatedAt(Object updatedAt){
    this.updatedAt = updatedAt;
    return this;
  }
  public Object getUpdatedAt() {
    return this.updatedAt;
  }

  @Fluent public TradingPartner setUuid(String uuid){
    this.uuid = uuid;
    return this;
  }
  public String getUuid() {
    return this.uuid;
  }

}