package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class OccurrencesTest {
    private final static List<String> words1 = List.of("", "Java", "JavaScript", "Python", "C", "Ruby", "Java", "Java", "", "null");

    @Test
    void createObject_ListNull_NullPointerException() {
        List<String> words2 = null;

        Throwable exception = assertThrows(NullPointerException.class, () -> {
            new Occurrences(words2);
        });

        assertEquals("Список равен null!",exception.getMessage());
    }

    @Test
    void createObject_LIstEmpty_RuntimeException() {
        List<String> words3 = List.of();

        Throwable exception = assertThrows(RuntimeException.class, () -> {
            new Occurrences(words3);
        });

        assertEquals("Список пуст",exception.getMessage());
    }

    @Test
    void getSumValues_EmptyString_RuntimeException() {

        Throwable exception = assertThrows(RuntimeException.class, () -> {
            Occurrences occurrences = new Occurrences(words1);
            occurrences.getSumValues("");
        });

        assertEquals("Не допустимое значение для колекции или же отсутствие элемента.",exception.getMessage());
    }
}