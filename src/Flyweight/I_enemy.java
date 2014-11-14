package Flyweight;

import bridge.Drawing;

public interface I_enemy extends GameEntity {
	
	public int gethealthpoints();
	public void sethealthpoints(int healthp) ;
	public void setDrawType(Drawing drawing) ;

}
