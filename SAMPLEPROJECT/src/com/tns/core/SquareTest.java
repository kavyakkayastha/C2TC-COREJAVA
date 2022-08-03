import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest 
{

	@Test
	void test() 
	{
		Testing t =new Testing();
		int output = t.square(4);
		assertEquals(16,output);
	}

}
