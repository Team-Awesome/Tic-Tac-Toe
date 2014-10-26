

public class Tic_Tac_Toe
{
	public static final int Rows = 3;
	public static final int Colums = 3;
	public static String [][]array = new String[Rows][Colums];
	
	public static void Initialize_Board()
	{
		for(int i = 0; i < Rows; i++)
		{
			for(int j = 0; j < Colums; j++)
			{
				array[i][j] = "*";
			}
		}

	}

	public static String Write_Board()
	{	
		Initialize_Board();
		String Board;
		
		Board  = "   1 2 3 \n";
		Board += "---------\n";
		Board += "1||" + array[0][0] + "|" + array[0][1] + "|" + array[0][2] + "|\n";
		Board += "2||" + array[1][0] + "|" + array[1][1] + "|" + array[1][2] + "|\n";;
		Board += "3||" + array[2][0] + "|" + array[2][1] + "|" + array[2][2] + "|\n";
			
		return Board;
		
		/*
		System.out.println("   1 2 3 ");
        	System.out.println("---------");
		System.out.println("1||*|*|*|");
        	System.out.println("2||*|*|*|");
        	System.out.println("3||*|*|*|");
        	System.out.println();
		*/
	}	

	public static void main(String[] args)
	{
		System.out.println("Lets do this peeps");
	}

}
