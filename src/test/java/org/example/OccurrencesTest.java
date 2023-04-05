package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class OccurrencesTest {
    public static List<String> words1 = List.of("", "Java", "JavaScript", "Python", "C", "Ruby", "Java", "Java", "", "null");
    public static List<String> words2 = null;
    public static List<String> words3 = List.of();

    @Test
    void TestCreateObject1() {
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            Occurrences occurrences = new Occurrences(words2);
        });
        assertEquals("Список равен null или же пуст!",exception.getMessage());
    }

    @Test
    void TestCreateObject2() {
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            Occurrences occurrences = new Occurrences(words3);
        });
        assertEquals("Список равен null или же пуст!",exception.getMessage());
    }

    @Test
    void TestGetSumValuesMethod1() {
        Occurrences occurrences = new Occurrences(words1);
        int result = occurrences.getSumValues("Java");
        assertEquals(3, result);
    }

    @Test
    void TestGetSumValuesMethod2() {
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            Occurrences occurrences = new Occurrences(words1);
            int result = occurrences.getSumValues("");
        });
        assertEquals("Не допустимое значение для колекции или же отсутствие элемента.",exception.getMessage());
    }
}