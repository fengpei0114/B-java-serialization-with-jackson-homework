package com.thoughtworks.capability.gtb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

  @JsonProperty("userId")
  private String id;
  private String name;
}
