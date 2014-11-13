package bridge;


public abstract class Shape 
{
	protected static Drawing myDrawing = new Drawing() {
		
		@Override
		public void drawPlayer(int i, int j) {
			myDrawing.drawPlayer(i, j) ;
			
		}
		
		@Override
		public void drawEnemy(int i, int j) {
			myDrawing.drawEnemy(i, j) ;
		}
	} ;
	
	
	abstract public void draw() ;
	
	protected Shape()
	{
		
	}
}
