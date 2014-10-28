import java.util.Scanner;

public class Tic_Tac_Toe
{
	private static final int Rows = 3;
	private static final int Colums = 3;
	private static String [][]array = new String[Rows][Colums];
	private static String Player = "X";	
	private static Scanner in = new Scanner(System.in);
	
	public static boolean Win()
	{
		for(int i = 0; i < 3; i++)
		{
        		if((array[0][i]==Player && array[1][i]==Player && array[2][i]==Player) || (array[i][0]==Player && array[i][1]==Player && array[i][2]==Player))
        		{
				return true;
			}
		}
		if((array[0][0]==Player && array[1][1]==Player && array[2][2]==Player || array[0][2]==Player && array[1][1]==Player && array[2][0]==Player))
		{
			return true;
		}
	
		return false;
	}

	public static boolean Play_Game()
	{
		System.out.println(Write_Board());
		int x = Translate_Input(in.next());		
		int y = in.nextInt();		
		
		Update_Array(x, y);
		if(Win())
		{
			return false;
		}
		Change_Player(Player);		

		return true;
	}

	public static int Translate_Input(String xCoordinate)
	{
		switch(xCoordinate)
		{
			case "a":
			case "A":
				return 1;
			case "b":
			case "B":
				return 2;
			case "c":
			case "C": 
				return 3;
			default:
				return 0; //fix later
		}
	}

	public static String Change_Player(String player)
	{
		if(player == "X")
    		{
        		Player = "O";
    		}
    		else
    		{
        		Player = "X";
	    	}
	
		return Player;
	}	

	public static void Update_Array(int x, int y)
	{
		array[x-1][y-1] = Player;
	}

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
		String Board;
	
		Board  = "   1 2 3 \n";
		Board += "---------\n";
		Board += "A||" + array[0][0] + "|" + array[0][1] + "|" + array[0][2] + "|\n";
		Board += "B||" + array[1][0] + "|" + array[1][1] + "|" + array[1][2] + "|\n";;
		Board += "C||" + array[2][0] + "|" + array[2][1] + "|" + array[2][2] + "|\n";
			
		return Board;
	}	
	
	public static void main(String[] args)
	{
		Initialize_Board();
		while(Play_Game());
	}

}
