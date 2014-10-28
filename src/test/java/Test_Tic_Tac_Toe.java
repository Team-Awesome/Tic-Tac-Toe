
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Tic_Tac_Toe
{	

	//test are executed last one first !!!!!!!!!!!!!!!!!!!1
	public static void main(String[] args)
	{
		//junit shit here

		org.junit.runner.JUnitCore.main("Test_Tic_Tac_Toe");
	}

	@Test
	public void testTranslate_Input_a()
	{
		assertEquals(1, Tic_Tac_Toe.Translate_Input("A"));
	}

        @Test
        public void testTranslate_Input_b()
        {
                assertEquals(2, Tic_Tac_Toe.Translate_Input("b"));
        }

        @Test
        public void testTranslate_Input_c()
        {
                assertEquals(3, Tic_Tac_Toe.Translate_Input("C"));
        }

	@Test
	public void testChange_Player_XtoO()
	{
		assertEquals("X", Tic_Tac_Toe.Change_Player("O"));
	}	

        @Test
        public void testChange_Player_OtoX()
        {
                assertEquals("O", Tic_Tac_Toe.Change_Player("X"));
        }

/*	@Test
	public void testUpdate_Array()
	{	
                assertEquals("   1 2 3 \n---------\n1||X|*|*|\n2||*|*|*|\n3||*|*|*|\n"
                                , Tic_Tac_Toe.Write_Board());
		
	}*/

        @Test
        public void testWrite_Board()
        {
                assertEquals("   1 2 3 \n---------\n1||*|*|*|\n2||*|*|*|\n3||*|*|*|\n"
                                , Tic_Tac_Toe.Write_Board());
        }


}






