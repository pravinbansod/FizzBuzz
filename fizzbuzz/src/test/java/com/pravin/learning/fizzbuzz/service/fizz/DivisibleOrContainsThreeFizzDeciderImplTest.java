package com.pravin.learning.fizzbuzz.service.fizz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivisibleOrContainsThreeFizzDeciderImplTest {

  private DivisibleOrContainsThreeFizzDeciderImpl underTest = new DivisibleOrContainsThreeFizzDeciderImpl();

  @Test
  public void returnsTrueWhenInputNumberDivisibleByThree() {
    assertTrue(underTest.isFizz(6));
  }

  @Test
  public void returnsTrueWhenInputNumberContainsThree() {
    assertTrue(underTest.isFizz(13));
  }

  @Test
  public void returnsFalseWhenInputNumberNotDivisibleByThreeAndDoesNotContainThree() {
    assertFalse(underTest.isFizz(1));
  }

}
