package com.pravin.learning.fizzbuzz.service.buzz;

public class ContainsFiveBuzzDeciderImpl implements BuzzDecider {

  @Override
  public boolean isBuzz(int number) {
    return String.valueOf(number).contains("5");
  }

}
