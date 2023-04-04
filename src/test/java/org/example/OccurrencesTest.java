package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class OccurrencesTest {
    public static List<String> words1 = List.of("" ,"Java", "JavaScript", "Python", "C", "Ruby", "Java","Java","","null");
    public static List<String> words2 = null;
    public static List<String> words3 = List.of();


    @Test
    void TestGetSumValuesMethod() {
        Occurrences occurrences = new Occurrences(words3);
        int result =occurrences.getSumValues("Java");
        assertEquals(3,result);
    }
}