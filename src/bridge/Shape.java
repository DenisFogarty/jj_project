package bridge;


public abstract class Shape 
{
	protected static Drawing myDrawing = new Drawing() {
		
		@Override
		public void drawPlayer(int i, int j) {
			myDrawing.drawPlayer(i, j) ;
			
		}
		
		@Override
		public void drawEnemy() {
			myDrawing.drawEnemy() ;
		}
	} ;
	
	
	abstract public void draw() ;
	
	protected Shape()
	{
		
	}
	
	/*protected void drawEnemy()
	{
		myDrawing.drawEnemy() ;
	}
	
	protected void drawPlayer()
	{
		myDrawing.drawPlayer() ;
	}*/
}
