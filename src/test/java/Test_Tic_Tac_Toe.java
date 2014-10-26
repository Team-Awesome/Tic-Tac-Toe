
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Tic_Tac_Toe
{
	public static void main(String[] args)
	{
		//junit shit here

		org.junit.runner.JUnitCore.main("Test_Tic_Tac_Toe");
	}
	

	@Test
	public void smuTest()
	{
		assertEquals(1, Tic_Tac_Toe.smu());
	}

}


