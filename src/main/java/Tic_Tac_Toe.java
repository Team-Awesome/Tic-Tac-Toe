

public class Tic_Tac_Toe
{
	public static String Write_Board()
	{	
		String Board;
		
		Board  = "   1 2 3 \n";
		Board += "---------\n";
		Board += "1||*|*|*|\n";
		Board += "2||*|*|*|\n";
		Board += "3||*|*|*|\n";
			
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
