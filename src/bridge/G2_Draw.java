package bridge;

//concrete class of drawing
public class G2_Draw implements Drawing
{
	public void drawEnemy(int i, int j) 
	{
		GDP_2.drawAnEnemy(i, j) ;
	}
	
	public void drawPlayer(int i, int j) 
	{
		GDP_2.drawAPlayer(i, j) ;
	}
	
	public void drawworldobject(int i, int j) 
	{
		GDP_2.drawWorldObject(i, j) ;
	}
}
