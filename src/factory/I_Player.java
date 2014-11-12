package factory;

import bridge.Drawing;

public interface I_Player extends GameObject {

	public int gethealth();
	public void sethealthpoints(int healthp) ;
	public void setDrawType(Drawing drawing) ;
	
	public void moveleft();
	public void moveRight();
}
