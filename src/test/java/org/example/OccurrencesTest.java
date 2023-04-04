package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class OccurrencesTest {
    public static List<String> words = List.of("" ,"Java", "JavaScript", "Python", "C", "Ruby", "Java","Java","","null");

    @Test
    void TestGetSumValuesMethod() {
        Occurrences occurrences = new Occurrences(words);
        int result =occurrences.getSumValues("Java");
        assertEquals(3,result);
    }
}