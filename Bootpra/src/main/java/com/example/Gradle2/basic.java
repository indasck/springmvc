package com.example.Gradle2;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class basic {

    public static void main(String[] args) {
        String input = "hello";
        
        // Encode the input string to Base64
        String encStr = Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
        System.out.println("Encoded Data => " + encStr);
        
        // Decode the Base64 encoded string back to original
        byte[] decodedBytes = Base64.getDecoder().decode(encStr);
        String decodedStr = new String(decodedBytes, StandardCharsets.UTF_8);
        System.out.println("Decoded Data => " + decodedStr);
    }
}
