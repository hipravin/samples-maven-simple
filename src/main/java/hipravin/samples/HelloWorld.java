package hipravin.samples;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloWorld {
    public static void main(String[] args) {
        new ObjectMapper();//to use dependencies
        System.out.println("Hello, world! ".repeat(3));
    }
}
