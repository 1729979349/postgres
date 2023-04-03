package com.croky.postgres.client.utils;

import com.croky.common.util.StringUtils;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * @author Croky
 * @date 2022-04-29 2:30
 */
@JsonComponent(value="postgresExpandJackSonSupport")
public class ExpandJackSonSupport {
    public static class ByteJsonSerializer extends JsonSerializer<Byte> {
        @Override
        public void serialize(Byte aByte, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (null == aByte) {
                jsonGenerator.writeString("0");
            } else {
                jsonGenerator.writeString(String.valueOf(aByte.byteValue()));
            }
        }
    }
    public static class ByteJsonDeserializer extends JsonDeserializer<Byte> {

        @Override
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
            String text = jsonParser.getText();
            if (StringUtils.isBlank(text)) {
                return (byte)0;
            } else {
                try {
                    return Byte.parseByte(text.replaceAll("\"",""));
                } catch (NumberFormatException e) {
                    return (byte)0;
                }
            }
        }
    }
}
