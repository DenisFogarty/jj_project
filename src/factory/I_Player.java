package factory;

public interface I_Player extends GameObject {

	public int gethealth();
	public void sethealthpoints(int healthp) ;
	
	public void moveleft();
	public void moveRight();
}
