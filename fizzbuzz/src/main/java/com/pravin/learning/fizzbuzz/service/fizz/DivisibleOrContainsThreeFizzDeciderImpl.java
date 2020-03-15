package com.pravin.learning.fizzbuzz.service.fizz;

public class DivisibleOrContainsThreeFizzDeciderImpl implements FizzDecider {

  private DivisibleByThreeFizzDeciderImpl divisibleByThreeFizzDeciderImpl = new DivisibleByThreeFizzDeciderImpl();
  private ContainsThreeFizzDeciderImpl containsThreeFizzDeciderImpl = new ContainsThreeFizzDeciderImpl();

  @Override
  public boolean isFizz(int number) {
    return divisibleByThreeFizzDeciderImpl.isFizz(number) || containsThreeFizzDeciderImpl.isFizz(number);
  }

}
