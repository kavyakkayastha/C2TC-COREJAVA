import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void test() 
	{
		Testing t =new Testing();
		int output = t.sum();
		assertEquals(30,output);	
	}

}
