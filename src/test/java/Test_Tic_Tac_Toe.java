
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Tic_Tac_Toe
{	

	//test are executed last one first !!!!!!!!!!!!!!!!!!!1
	public static void main(String[] args)
	{
		org.junit.runner.JUnitCore.main("Test_Tic_Tac_Toe");
	}

	@Test
        public void testIs_Marked()
        {
                assertEquals(false, Tic_Tac_Toe.Is_Marked(2, 2));
        }

        @Test
        public void testIs_Input_In_Bounds_4()
        {
                assertEquals(false, Tic_Tac_Toe.Is_Input_In_Bounds(10, 2));
        }

        @Test
        public void testIs_Input_In_Bounds_3()
        {
                assertEquals(false, Tic_Tac_Toe.Is_Input_In_Bounds(2, 10));
        }

        @Test
        public void testIs_Input_In_Bounds_2()
        {
                assertEquals(false, Tic_Tac_Toe.Is_Input_In_Bounds(4, 10));
        }

	@Test
        public void testIs_Input_In_Bounds_1()
	{
		assertEquals(true, Tic_Tac_Toe.Is_Input_In_Bounds(1, 1));
	}

	@Test
        public void testWin()
	{
		assertEquals(false, Tic_Tac_Toe.Win());
	}

        @Test
        public void testTranslate_yCoordinate_num()
        {
                assertEquals(3, Tic_Tac_Toe.Translate_yCoordinate("3"));
        }

        @Test
        public void testTranslate_yCoordinate_char()
        {
                assertEquals(0, Tic_Tac_Toe.Translate_yCoordinate("G"));
        }

	@Test
	public void testTranslate_xCoordinate_a()
	{
		assertEquals(1, Tic_Tac_Toe.Translate_xCoordinate("A"));
	}

        @Test
        public void testTranslate_xCoordinate_b()
        {
                assertEquals(2, Tic_Tac_Toe.Translate_xCoordinate("b"));
        }

        @Test
        public void testTranslate_xCoordinate_c()
        {
                assertEquals(3, Tic_Tac_Toe.Translate_xCoordinate("C"));
        }

        @Test
        public void testTranslate_xCoordinate_other()
        {
                assertEquals(0, Tic_Tac_Toe.Translate_xCoordinate("j"));
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

        @Test
        public void testWrite_Board()
        {
                assertEquals("\t   1 2 3 \n	---------\n	A||null|null|null|\n	B||null|null|null|\n	C||null|null|null|\n"
                                , Tic_Tac_Toe.Write_Board());
        }
}






