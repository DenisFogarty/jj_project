package factory;

import Flyweight.I_GameWorld_Object;
import bridge.Drawing;

public class Obstacle implements I_GameWorld_Object {
	private int x_Coord ;
	private int y_Coord ;
	private int width,height ;
	private String id ;
    private Drawing drawing ;

	
	public Obstacle(String id,int x,int y,int width,int height)
	{   this.id = id ;
		this.x_Coord = x ;
		this.y_Coord = y ;
		this.height = height ;
		this.width = width ;
				
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
	
	public void setWOrldObject_Coords(int x_Coord,int y_Coord) {
		this.x_Coord = x_Coord ;
		this.y_Coord = y_Coord;
	}

	@Override
	public int getWidth() {
		
		return this.width ;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public void setHeight(int height) {
		this.height = height ;		
	}

	@Override
	public String getObjectId() {
		return this.id ;
	}

	@Override
	public void setObjectid(String id) {
		this.id = id ;
	}

	@Override
	public void setDrawType(Drawing drawing) {
		this.drawing = drawing ;		
	}

	@Override
	public void draw() {
		 drawing.drawworldobject(this.getX_Coord(), this.getY_Coord());
		
	}
	
	
 
 
 
}
