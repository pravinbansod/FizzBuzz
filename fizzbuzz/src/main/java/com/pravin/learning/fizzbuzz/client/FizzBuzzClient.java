package com.pravin.learning.fizzbuzz.client;

import com.pravin.learning.fizzbuzz.number.descriptor.FizzBuzzNumberDivisibleOrContainsStrategy;
import com.pravin.learning.fizzbuzz.number.descriptor.FizzBuzzNumberDivisibleStrategy;
import com.pravin.learning.fizzbuzz.number.print.NumberPrintService;
import com.pravin.learning.fizzbuzz.number.print.NumberPrintServiceImpl;

public class FizzBuzzClient {

  private NumberPrintService numberPrintServiceWihtDivisibleStrategy = new NumberPrintServiceImpl(
      new FizzBuzzNumberDivisibleStrategy(), System.out);
  private NumberPrintService numberPrintServiceWihtDivisibleOrContainsStrategy = new NumberPrintServiceImpl(
      new FizzBuzzNumberDivisibleOrContainsStrategy(), System.out);

  public static void main(String[] args) {
    FizzBuzzClient fizzBuzzClient = new FizzBuzzClient();
    fizzBuzzClient.printNumbers();
  }

  public void printNumbers() {
    System.out.println("----Print Number 1 to 100 ------");
    numberPrintServiceWihtDivisibleStrategy.printNumbers(1, 100);
    System.out.println("--------------------------------");

    System.out.println("----Print Number 1 to 100 ------");
    numberPrintServiceWihtDivisibleOrContainsStrategy.printNumbers(1, 100);
    System.out.println("--------------------------------");
  }
}
