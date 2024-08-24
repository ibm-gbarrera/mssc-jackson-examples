package guru.springframework.msscjacksonexamples.model;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonTest
public class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonParseException, JsonMappingException, IOException {
        String json = "{\"beerName\":\"Ale Beer\",\"beerStyle\":\"Ale\",\"upc\":12344,\"price\":\"12.99\",\"createdDate\":\"2024-08-23T19:03:04.466921-06:00\",\"lastUpdatedDate\":\"2024-08-23T19:03:04.46695-06:00\",\"myLocalDate\":\"20240823\",\"beerId\":\"6fa8f6bf-545f-4db1-9804-80fe4cb9279f\"}";
    
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
    
}
