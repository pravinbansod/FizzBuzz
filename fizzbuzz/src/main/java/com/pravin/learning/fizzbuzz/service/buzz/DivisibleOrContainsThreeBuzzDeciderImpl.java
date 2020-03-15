package com.pravin.learning.fizzbuzz.service.buzz;

public class DivisibleOrContainsThreeBuzzDeciderImpl implements BuzzDecider {

  private DivisibleByFiveBuzzDeciderImpl divisibleByFiveBuzzDeciderImpl = new DivisibleByFiveBuzzDeciderImpl();
  private ContainsFiveBuzzDeciderImpl containsFiveBuzzDeciderImpl = new ContainsFiveBuzzDeciderImpl();

  @Override
  public boolean isBuzz(int number) {
    return divisibleByFiveBuzzDeciderImpl.isBuzz(number) || containsFiveBuzzDeciderImpl.isBuzz(number);
  }

}
