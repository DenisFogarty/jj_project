package bridge;

//class used to implement an external drawing program
public class GDP_1 
{
	public static void draw_an_enemy(int i, int j)
	{
		System.out.print("An enemy has been drawn on the screen " + i + " " + j + "\n") ;
	}
	
	public static void draw_a_player(int i, int j)
	{
		System.out.print("The player has been drawn on the screen at " + i + " " + j + " \n") ;
	}
	
	public static void draw_world_object(int i, int j)
	{
		System.out.print("The World Object has been drawn on the screen at " + i + " " + j + " \n") ;
	}
}
