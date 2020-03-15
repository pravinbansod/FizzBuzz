package com.pravin.learning.fizzbuzz.number.print;

import java.io.PrintStream;

import com.pravin.learning.fizzbuzz.number.descriptor.NumberDescriptorService;

public class NumberPrintServiceImpl implements NumberPrintService {

  private final NumberDescriptorService numberDescriptorService;
  private final PrintStream printStream;

  public NumberPrintServiceImpl(final NumberDescriptorService numberDescriptorService, final PrintStream printStream) {
    this.numberDescriptorService = numberDescriptorService;
    this.printStream = printStream;
  }

  @Override
  public void printNumbers(int firstNumber, int lastNumber) {
    for (int i = firstNumber; i <= lastNumber; i++) {
      printStream.println(numberDescriptorService.getWordForNumber(i));
    }

  }
}
