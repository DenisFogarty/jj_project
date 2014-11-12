package factory;

import bridge.Drawing;

public interface I_enemy extends GameObject {
	
	public int gethealthpoints();
	public void sethealthpoints(int healthp) ;
	public void setDrawType(Drawing drawing) ;

}
