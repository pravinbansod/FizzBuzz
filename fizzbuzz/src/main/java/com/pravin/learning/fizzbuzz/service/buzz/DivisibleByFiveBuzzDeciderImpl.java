package com.pravin.learning.fizzbuzz.service.buzz;

public class DivisibleByFiveBuzzDeciderImpl implements BuzzDecider {

  @Override
  public boolean isBuzz(int number) {
    return number % 5 == 0;
  }

}
