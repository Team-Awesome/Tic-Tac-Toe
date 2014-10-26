
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Tic_Tac_Toe
{
	public static void main(String[] args)
	{
		//junit shit here

		org.junit.runner.JUnitCore.main("Test_Tic_Tac_Toe");
	}
	

/*	@Test
	public void testWrite_Board()
	{
		assertEquals("   1 2 3 \n---------\n1||*|*|*|\n2||*|*|*|\n3||*|*|*|\n"
				, Tic_Tac_Toe.Write_Board());
	}*/
	
	@Test
	public void testUpdate_Array()
	{
		assertEquals("   1 2 3 \n---------\n1||X|*|*|\n2||*|*|*|\n3||*|*|*|\n"
				, Tic_Tac_Toe.Write_Board());
	}

}


