

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FizzBuzzTest {

	
	@Test
	void testConvertFizzBuzz() {
		Assert.assertEquals("1", FizzBuzz.convertFizzBuzz(1));
		Assert.assertEquals("2", FizzBuzz.convertFizzBuzz(2));
		Assert.assertEquals("Fizz", FizzBuzz.convertFizzBuzz(3));
		Assert.assertEquals("Buzz", FizzBuzz.convertFizzBuzz(5));
		Assert.assertEquals("FizzBuzz", FizzBuzz.convertFizzBuzz(15));
	}

}
