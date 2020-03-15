package com.pravin.learning.fizzbuzz.service;

import java.util.Optional;

public interface WordDecider {
  Optional<String> getWordForNumber(int number);
}
