package com.pravin.learning.fizzbuzz.service;

import java.util.Optional;

import com.pravin.learning.fizzbuzz.service.buzz.BuzzDecider;
import com.pravin.learning.fizzbuzz.service.buzz.DivisibleByFiveBuzzDeciderImpl;
import com.pravin.learning.fizzbuzz.service.fizz.DivisibleByThreeFizzDeciderImpl;
import com.pravin.learning.fizzbuzz.service.fizz.FizzDecider;

public class FizzBuzzWordDeciderImpl implements WordDecider {

  private final FizzDecider fizzDecider;
  private final BuzzDecider buzzDecider;

  public FizzBuzzWordDeciderImpl() {
    fizzDecider = new DivisibleByThreeFizzDeciderImpl();
    buzzDecider = new DivisibleByFiveBuzzDeciderImpl();
  }

  @Override
  public Optional<String> getWordForNumber(int number) {
    boolean isFizz = fizzDecider.isFizz(number);
    boolean isBuzz = buzzDecider.isBuzz(number);

    if (isFizz && isBuzz) {
      return Optional.of("FizzBuzz");
    }

    if (isFizz) {
      return Optional.of("Fizz");
    }

    if (isBuzz) {
      return Optional.of("buzz");
    }

    return Optional.empty();
  }
}
