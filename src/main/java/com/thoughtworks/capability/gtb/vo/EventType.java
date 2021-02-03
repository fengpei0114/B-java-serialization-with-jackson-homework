package com.thoughtworks.capability.gtb.vo;

public enum EventType {
  UPLOAD("U"), DOWNLOAD("D");

  private String code;

  EventType(String code) {
    this.code = code;
  }

  @JsonValue
  public String getCode() {
    return code;
  }
}
