package com.pravin.learning.fizzbuzz.number.descriptor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzNumberDivisibleStrategyTest {

  private FizzBuzzNumberDivisibleStrategy underTest = new FizzBuzzNumberDivisibleStrategy();

  @Test
  public void canGetFizzWordWhenNumberDivisibleByThree() {
    assertEquals("Fizz", underTest.getWordForNumber(6));
  }

  @Test
  public void canGetBuzzWordWhenNumberDivisibleByFive() {
    assertEquals("Buzz", underTest.getWordForNumber(5));
  }

  @Test
  public void canGetFizzBuzzWordWhenNumberDivisibleByThreeAndFive() {
    assertEquals("FizzBuzz", underTest.getWordForNumber(15));
  }

  @Test
  public void canGetNumberAsItIsWhenNotDivisibleByThreeAndFive() {
    assertEquals("7", underTest.getWordForNumber(7));
  }
}
