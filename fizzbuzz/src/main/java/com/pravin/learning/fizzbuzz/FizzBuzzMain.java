package com.pravin.learning.fizzbuzz;

import com.pravin.learning.fizzbuzz.service.FizzBuzzWordDeciderImpl;
import com.pravin.learning.fizzbuzz.service.WordDecider;

public class FizzBuzzMain {

  private WordDecider wc = new FizzBuzzWordDeciderImpl();

  public static void main(String[] args) {
    FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();
    fizzBuzzMain.printNumber(1, 20);
  }

  public void printNumber(int firstNumber, int lastNumber) {
    for (int i = firstNumber; i < lastNumber; i++) {
      System.out.println(wc.getWordForNumber(i).orElse(String.valueOf(i)));
    }
  }
}
