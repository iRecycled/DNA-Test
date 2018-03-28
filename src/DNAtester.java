import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DNAtester {
DNA test1,test2;

	@BeforeEach
	void setUp() throws Exception 
	{
		test1 = new DNA("ACTGC");
		test2 = new DNA("ACTGA");
	}

	@Test
	void testDNA() {
		assertFalse(test1.equals(null));
	}

	@Test
	void getSingleCase()
	{
		assertTrue(test1.contains("A"));
		assertTrue(test1.contains("G"));
	}
	
	@Test
	void testDoubleCase()
	{
		assertTrue(test1.contains("AC"));
		assertTrue(test1.contains("GC"));
	}
	
	@Test
	void testTripleCase()
	{
		assertTrue(test2.contains("ACT"));
		assertTrue(test2.contains("ACT"));
	}
	
	@Test
	void testWrongCase()
	{
		String b = "CTTT";
		assertFalse(test1.contains(b));
	}
	
	@Test 
	void incorrectBackwards()
	{
		String c = "CAG";
		assertFalse(test1.contains(c));
	}
	@Test
	void testBackwardsCase()
	{
		assertTrue(test1.contains("TGC"));
	}
	
	@Test
	void testBackwardsEndingCase()
	{
		assertTrue(test1.contains("CA"));
	}
	@Test
	void testGetSequence() {
		String seq = test1.getSequence();
		assertTrue(seq.equals(test1.getSequence()));
	}

	@Test
	void testGetLength() {
		int length = test1.getLength();
		int est = 4;
		assertTrue(est == length);
	}

	@Test
	void testOccurrences() {
		char a = 'A';
		test1.occurrences(a);
	}

	@Test
	void testContains() {
		assertTrue(test1.contains("AC")); // TODO
	}

	@Test
	void testComplement() {
		String comp = "ACGT";
		assertTrue((comp.equals(test1.complement())));
		
	}

	@Test
	void testClone() {
		DNA test2;
		test2 = test1;
		assertTrue(test2.equals(test1));
	}

	@Test
	void testEquals() {
		assertTrue(test1.equals(test1));
	}
}
