package Flyweight;

import bridge.Drawing;

public interface I_GameWorld_Object {

	public int getX_Coord() ;
	public int getY_Coord();
	public void setWOrldObject_Coords(int x_Coord,int y_Coord);
	public void setX_Coord(int x_Coord);
	public void setY_Coord(int y_Coord);
	public int getWidth();
	public void setWidth(int width);
	public int getHeight();
	public void setHeight(int height) ;
	public String getObjectId();
	public void setObjectid(String id);
	public void setDrawType(Drawing drawing) ;
	public void draw() ;

}
