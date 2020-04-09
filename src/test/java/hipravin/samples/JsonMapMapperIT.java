package hipravin.samples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class JsonMapMapperIT {
    @Test
    void testMapMap() throws JsonProcessingException {
        //This emulates integration test that for example can load data from real database
        //and is executed separately from Unit tests
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        System.out.println("INTEGRATION TEST");
        System.out.println(new ObjectMapper().writeValueAsString(map));
    }
}