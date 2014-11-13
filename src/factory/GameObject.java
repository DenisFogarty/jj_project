package factory;

public interface GameObject extends I_Subject,I_Observer {
	public void setname(String name);
	public String getname() ;
	public int getxCoord();
	public int getyCoord();
	public void setCoordinates(int x,int y) ;
	public void setxCoord(int x);
	public void setyCoord(int y);
	public void draw();
	//public Image  getObjectSprite() ;
	
}
