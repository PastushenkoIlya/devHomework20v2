package org.example;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LineReaderTest {
    @Test
    void toUpperCaseTest(){
        String input = "Some Text";
        assertEquals(LineReader.toUpperCase(input), input.toUpperCase());
    }
}