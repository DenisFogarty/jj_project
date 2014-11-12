package factory;

public class Obstacle implements I_Obstacle {
	private int x_Coord ;
	private int y_Coord ;
	
	public Obstacle(int x,int y)
	{
		this.x_Coord = x ;
		this.y_Coord = y ;
				
	}

	public int getX_Coord() {
		return x_Coord;
	}

	public void setX_Coord(int x_Coord) {
		this.x_Coord = x_Coord;
	}

	public int getY_Coord() {
		return y_Coord;
	}

	public void setY_Coord(int y_Coord) {
		this.y_Coord = y_Coord;
	}
	
	public void setPlatform_Coords(int x_Coord,int y_Coord) {
		this.x_Coord = x_Coord ;
		this.y_Coord = y_Coord;
	}
	
	
 
 
 
}
