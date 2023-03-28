package Poem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairTest {

	@Test
	void test() {
		Pair test = new Pair("test", 0);
		boolean result = test.leftEquals("test");
		assertTrue(result);
	}

}
