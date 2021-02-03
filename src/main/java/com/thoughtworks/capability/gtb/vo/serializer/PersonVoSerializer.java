package com.thoughtworks.capability.gtb.vo.serializer;

import com.fasterxml.jackson.databind.JsonSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public class PersonVoSerializer extends StdSerializer<PersonVo> {
    protected PersonVoSerializer() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo personVo, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if(personVo.getAge()==null){
            personVo.setAge(0);
        }
        if(personVo.getHobby()!=null) {
            gen.writeStringField("hobby",personVo.getHobby());
        }
        gen.writeStartObject();
        gen.writeStringField("id",personVo.getId());
        gen.writeNumberField("age",personVo.getAge());
        gen.writeStringField("name",personVo.getName());
        gen.writeEndObject();
    }
}
