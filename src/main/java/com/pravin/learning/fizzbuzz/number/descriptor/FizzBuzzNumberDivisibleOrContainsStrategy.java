package com.pravin.learning.fizzbuzz.number.descriptor;

public class FizzBuzzNumberDivisibleOrContainsStrategy extends AbstractFizzBuzzNumberDescriptorService {

	private FizzDecider fizzDecider = (int number) -> (number % 3 == 0 || String.valueOf(number).contains("3"));
	private BuzzDecider buzzDecider = (int number) -> (number % 5 == 0 || String.valueOf(number).contains("5"));

	@Override
	/**
	 * Return word description for input number.
	 * <ul>
	 * <li>Returns Fizz if input number is divisible by 3 or contains 3.</li>
	 * <li>Returns Buzz if input number is divisible by 5 or contains 5.</li>
	 * <li>Returns FizzBuzz if input number is divisible by 3 and divisible by
	 * 5.</li>
	 * <li>Returns FizzBuzz if input number contains 3 and divisible by 5.</li>
	 * <li>Returns FizzBuzz if input number is divisible by 3 and contains 5.</li>
	 * <li>Returns FizzBuzz if input number contains 3 and contains 5.</li>
	 * <li>Returns number as it is when input number does not fall into any of the
	 * above criteria.</li>
	 * </ul>
	 *
	 * @param number input number
	 *
	 * @return
	 */
	public String getWordForNumber(int number) {
		return getDescription(number, fizzDecider, buzzDecider);
	}
}
