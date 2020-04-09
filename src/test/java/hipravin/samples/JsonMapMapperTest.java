package hipravin.samples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JsonMapMapperTest {
    @Test
    void testMapMap() throws JsonProcessingException {
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        //below test is randomly failing because order of keys is not fixed
//        assertEquals("{\"key1\":\"value1\",\"key2\":\"value2\"}" , new ObjectMapper().writeValueAsString(map));
    }
}