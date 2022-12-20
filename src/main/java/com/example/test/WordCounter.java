package com.example.test;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Cristian Martín Ferrer on 20/12/22
 */
public class WordCounter {

  private String cleanupText(final String text) {
    return text.replaceAll("[^a-z A-Z0-9]", "");
  }

  public Map<String, Long> getWordOccurrences(final String text) {
    return Arrays.stream(cleanupText(text).split(" "))
        .map(String::toLowerCase)
        .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
  }
}
