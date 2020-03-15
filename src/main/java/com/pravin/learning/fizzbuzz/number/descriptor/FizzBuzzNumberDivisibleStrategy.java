package com.pravin.learning.fizzbuzz.number.descriptor;

public class FizzBuzzNumberDivisibleStrategy extends AbstractFizzBuzzNumberDescriptorService {

	private FizzDecider fizzDecider = (int number) -> number % 3 == 0;
	private BuzzDecider buzzDecider = (int number) -> number % 5 == 0;

	@Override
	/**
	 * Return word description for input number.
	 * <ul>
	 * <li>Returns FizzBuzz if input number is divisible by both 3 and 5.</li>
	 * <li>Returns Fizz if input number is divisible by 3.</li>
	 * <li>Returns Buzz if input number is divisible by 5.</li>
	 * <li>Returns number as it is when input number is neither divisible by 3 nor
	 * by 5.</li>
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
