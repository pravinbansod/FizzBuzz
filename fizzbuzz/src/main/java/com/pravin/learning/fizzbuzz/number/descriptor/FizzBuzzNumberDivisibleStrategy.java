package com.pravin.learning.fizzbuzz.number.descriptor;

public class FizzBuzzNumberDivisibleStrategy extends AbstractFizzBuzzNumberDescriptorService {

  private FizzDecider fizzDecider = (int number) -> number % 3 == 0;
  private BuzzDecider buzzDecider = (int number) -> number % 5 == 0;

  @Override
  public String getWordForNumber(int number) {
    return getDescription(number, fizzDecider, buzzDecider);
  }
}
