package com.thoughtworks.capability.gtb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.vo.serializer.PersonVoSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(using = PersonVoSerializer.class)
public class PersonVo {

  private String id;
  private Integer age;
  private String name;
  private String hobby;
}
