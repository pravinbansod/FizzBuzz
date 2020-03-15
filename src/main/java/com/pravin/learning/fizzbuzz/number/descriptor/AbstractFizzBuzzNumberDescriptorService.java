package com.pravin.learning.fizzbuzz.number.descriptor;

/*
 * Abstract Fizz Buzz Description Service
 */
public abstract class AbstractFizzBuzzNumberDescriptorService implements NumberDescriptorService {

	/**
	 * Return word description for input number.
	 * <ul>
	 * <li>Returns FizzBuzz if input number satisfies both FizzDecider and
	 * BuzzDecider conditions.</li>
	 * <li>Returns Fizz if input number satisfies only FizzDecider condition.</li>
	 * <li>Returns Buzz if input number satisfies only BuzzDecider condition.</li>
	 * <li>Returns number as it is when input number does not satisfy FizzDecider
	 * and BuzzDecider conditions.</li>
	 * </ul>
	 *
	 * @param number      input number
	 * @param fizzDecider Fizz Decider implementation
	 * @param buzzDecider Buzz Decider implementation
	 * @return
	 */
	protected String getDescription(int number, FizzDecider fizzDecider, BuzzDecider buzzDecider) {

		boolean isFizz = fizzDecider.isFizz(number);
		boolean isBuzz = buzzDecider.isBuzz(number);

		if (isFizz && isBuzz) {
			return "FizzBuzz";
		}

		if (isFizz) {
			return "Fizz";
		}

		if (isBuzz) {
			return "Buzz";
		}

		return Integer.toString(number);
	}

}
