package com.pravin.learning.fizzbuzz.service.fizz;

public class DivisibleByThreeFizzDeciderImpl implements FizzDecider {

  @Override
  public boolean isFizz(int number) {
    return number % 3 == 0;
  }

}
