package bridge;


public class G1_Draw implements Drawing
{
	public void drawEnemy(int i, int j) 
	{
		GDP_1.draw_an_enemy(i, j) ;
	}
	
	public void drawPlayer(int i, int j) 
	{
		GDP_1.draw_a_player(i, j) ;
	}
}
