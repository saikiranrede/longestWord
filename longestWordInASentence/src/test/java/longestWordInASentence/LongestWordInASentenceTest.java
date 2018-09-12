package longestWordInASentence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class LongestWordInASentenceTest {

	String phrase = "The longest word in a sentence is";

	@Test
	@DisplayName("Word and its length")
	void testLengthOfaWordInASentence() {
		assertEquals(8, LongestWordInASentence.lengthOfaWordInASentence(phrase).get(LongestWordInASentence.keyLen));
		assertEquals("sentence", LongestWordInASentence.lengthOfaWordInASentence(phrase).get(LongestWordInASentence.LongWord));
	}
	
	@Test
	@DisplayName("Word and its length")
	void testLengthOfaWordInASentenceNegative() {
		assertNotEquals(10, LongestWordInASentence.lengthOfaWordInASentence(phrase).get(LongestWordInASentence.keyLen));
		assertNotEquals("longest", LongestWordInASentence.lengthOfaWordInASentence(phrase).get(LongestWordInASentence.LongWord));
	}
	
	@Test
	@DisplayName("Null pointer Exception")
	void testForNullException() {
		Assertions.assertNull(LongestWordInASentence.lengthOfaWordInASentence(null).get(LongestWordInASentence.keyLen));
	}
}
