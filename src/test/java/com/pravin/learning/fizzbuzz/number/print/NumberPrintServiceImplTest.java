package com.pravin.learning.fizzbuzz.number.print;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.pravin.learning.fizzbuzz.number.descriptor.NumberDescriptorService;

public class NumberPrintServiceImplTest {

	private NumberDescriptorService numberDescriptorService = Mockito.mock(NumberDescriptorService.class);
	private PrintStream printStream = Mockito.mock(PrintStream.class);

	private NumberPrintServiceImpl underTest;

	@Before
	public void setup() {
		underTest = new NumberPrintServiceImpl(numberDescriptorService, printStream);
	}

	@Test
	public void canPrintNumbers() {
		when(numberDescriptorService.getWordForNumber(Mockito.anyInt())).thenReturn("number");
		underTest.printNumbers(1, 10);
		verify(numberDescriptorService, times(10)).getWordForNumber(Mockito.anyInt());
		verify(printStream, times(10)).println("number");
	}
}
