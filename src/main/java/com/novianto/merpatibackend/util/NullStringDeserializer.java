package com.novianto.merpatibackend.util;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class NullStringDeserializer extends StdDeserializer<String> {

    public NullStringDeserializer() {
        this(null);
    }

    public NullStringDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        String result = jsonParser.getValueAsString();
        return result.isBlank() ? null : result;
    }
}
