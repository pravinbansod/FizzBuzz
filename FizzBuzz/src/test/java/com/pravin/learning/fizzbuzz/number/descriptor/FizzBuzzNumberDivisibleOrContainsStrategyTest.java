package com.pravin.learning.fizzbuzz.number.descriptor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzNumberDivisibleOrContainsStrategyTest {

  private FizzBuzzNumberDivisibleOrContainsStrategy underTest = new FizzBuzzNumberDivisibleOrContainsStrategy();

  @Test
  public void canGetFizzWordWhenNumberDivisibleByThreeAndDoesNotContainThree() {
    assertEquals("Fizz", underTest.getWordForNumber(6));
  }

  @Test
  public void canGetBuzzWordWhenNumberDivisibleByFiveAndDoesNotContainFive() {
    assertEquals("Buzz", underTest.getWordForNumber(10));
  }

  @Test
  public void canGetFizzBuzzWordWhenNumberDivisibleByThreeAndFive() {
    assertEquals("FizzBuzz", underTest.getWordForNumber(15));
  }

  @Test
  public void canGetNumberAsItIsWhenNotDivisibleByThreeAndFiveAndDoesNotContainThreeAndFive() {
    assertEquals("7", underTest.getWordForNumber(7));
  }

  @Test
  public void canGetFizzWordWhenNumberContainsThreeAndNotDivisibleByThree() {
    assertEquals("Fizz", underTest.getWordForNumber(13));
  }

  @Test
  public void canGetBuzzWordWhenNumberContainsFiveAndNotDivisibleByFive() {
    assertEquals("Buzz", underTest.getWordForNumber(52));
  }

  @Test
  public void canGetFizzBuzzWordWhenNumberContainsThreeAndFiveAndNotDivisibleByThreeAndFive() {
    assertEquals("FizzBuzz", underTest.getWordForNumber(53));
  }

  @Test
  public void canGetNumberAsItIsWhenNotContainThreeAndFive() {
    assertEquals("8", underTest.getWordForNumber(8));
  }

}
