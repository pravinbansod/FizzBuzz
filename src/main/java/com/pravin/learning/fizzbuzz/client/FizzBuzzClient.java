package com.pravin.learning.fizzbuzz.client;

import com.pravin.learning.fizzbuzz.number.descriptor.FizzBuzzNumberDivisibleOrContainsStrategy;
import com.pravin.learning.fizzbuzz.number.descriptor.FizzBuzzNumberDivisibleStrategy;
import com.pravin.learning.fizzbuzz.number.print.NumberPrintService;
import com.pravin.learning.fizzbuzz.number.print.NumberPrintServiceImpl;

public class FizzBuzzClient {

	public static void main(String[] args) {
		NumberPrintService numberPrintServiceWihtDivisibleStrategy = new NumberPrintServiceImpl(
				new FizzBuzzNumberDivisibleStrategy(), System.out);
		NumberPrintService numberPrintServiceWihtDivisibleOrContainsStrategy = new NumberPrintServiceImpl(
				new FizzBuzzNumberDivisibleOrContainsStrategy(), System.out);

		FizzBuzzClient fizzBuzzClient = new FizzBuzzClient();
		fizzBuzzClient.printNumbers(numberPrintServiceWihtDivisibleStrategy);
		fizzBuzzClient.printNumbers(numberPrintServiceWihtDivisibleOrContainsStrategy);
	}

	public void printNumbers(NumberPrintService numberPrintService) {
		System.out.println("----Print Number 1 to 100 ------");
		numberPrintService.printNumbers(1, 100);
		System.out.println("--------------------------------");
	}
}
