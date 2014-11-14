package factory;

import Flyweight.GameEntity;
import bridge.Drawing;

public interface I_Player extends GameEntity {

	public int gethealth();
	public void sethealthpoints(int healthp) ;
	public void setDrawType(Drawing drawing) ;
	
	public void moveleft();
	public void moveRight();
}
