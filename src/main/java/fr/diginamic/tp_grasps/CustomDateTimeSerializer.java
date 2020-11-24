package fr.diginamic.tp_grasps;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CustomDateTimeSerializer extends StdDeserializer<LocalDateTime> {

	/** serialVersionUID */
	private static final long serialVersionUID = 1808985659654443100L;
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public CustomDateTimeSerializer() {
		this(null);
	}

	public CustomDateTimeSerializer(Class<LocalDateTime> t) {
		super(t);
	}


	@Override
	public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		
		String date = p.getText();
		return LocalDateTime.parse(date, formatter);
	}
}