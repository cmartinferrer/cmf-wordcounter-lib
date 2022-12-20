package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author Cristian Martín Ferrer on 20/12/22
 */
class WordCounterTest {

  final WordCounter wordCounter = new WordCounter();

  @Test
  void givenTextWhenCountOccurencesThenReturnMapWithAllOccurences() {
    val text = "Hola, este es mi texto de prueba; ¡hola prueba!";

    final Map<String, Long> actual = wordCounter.getWordOccurrences(text);

    final Map<String, Long> expected = getExpected();

    assertEquals(expected.toString(), actual.toString());
  }

  private static Map<String, Long> getExpected() {
    final Map<String, Long> expected = new LinkedHashMap<>();
    expected.put("hola", 2L);
    expected.put("este", 1L);
    expected.put("es", 1L);
    expected.put("mi", 1L);
    expected.put("texto", 1L);
    expected.put("de", 1L);
    expected.put("prueba", 2L);
    return expected;
  }

}