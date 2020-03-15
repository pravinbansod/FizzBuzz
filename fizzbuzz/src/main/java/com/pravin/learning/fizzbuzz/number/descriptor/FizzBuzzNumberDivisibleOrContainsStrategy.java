package com.pravin.learning.fizzbuzz.number.descriptor;

public class FizzBuzzNumberDivisibleOrContainsStrategy extends AbstractFizzBuzzNumberDescriptorService {

  private FizzDecider fizzDecider = (int number) -> (number % 3 == 0 || String.valueOf(number).contains("3"));
  private BuzzDecider buzzDecider = (int number) -> (number % 5 == 0 || String.valueOf(number).contains("5"));

  @Override
  public String getWordForNumber(int number) {
    return getDescription(number, fizzDecider, buzzDecider);
  }
}
