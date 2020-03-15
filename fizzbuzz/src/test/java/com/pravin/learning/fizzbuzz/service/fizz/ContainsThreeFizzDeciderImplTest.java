package com.pravin.learning.fizzbuzz.service.fizz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContainsThreeFizzDeciderImplTest {

  private ContainsThreeFizzDeciderImpl underTest = new ContainsThreeFizzDeciderImpl();

  @Test
  public void returnsTrueWhenInputNumberContainsThree() {
    assertTrue(underTest.isFizz(13));
  }

  @Test
  public void returnsFalseWhenInputNumberIsDoesNotContainThree() {
    assertFalse(underTest.isFizz(6));
  }

}
