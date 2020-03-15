package com.pravin.learning.fizzbuzz.service.fizz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pravin.learning.fizzbuzz.service.fizz.DivisibleByThreeFizzDeciderImpl;

public class DivisibleByThreeFizzDeciderImplTest {

  private DivisibleByThreeFizzDeciderImpl underTest = new DivisibleByThreeFizzDeciderImpl();

  @Test
  public void returnsTrueWhenInputNumberDivisibleByThree() {
    assertTrue(underTest.isFizz(6));
  }

  @Test
  public void returnsFalseWhenInputNumberIsNotDivisibleByThree() {
    assertFalse(underTest.isFizz(13));
  }

}
