package com.pravin.learning.fizzbuzz.service.fizz;

public class ContainsThreeFizzDeciderImpl implements FizzDecider {

  @Override
  public boolean isFizz(int number) {
    return String.valueOf(number).contains("3");
  }

}
