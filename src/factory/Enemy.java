package factory;

import java.util.ArrayList;
import java.util.List;

import bridge.Drawing;

//Should this be abstract?
public class Enemy implements I_enemy,GameObject {

	private String name ;
	private int x,y,health ;
    private List<I_Observer> observers ;
    private List<I_Subject> Subjects ;
    private ChangeManager chman ;
    private Drawing drawing ;
    
	protected Enemy( String name, int health,int x,int y,ChangeManager c)
	{
		this.name = name ;
		this.health = health;
		this.x = x;
		this.y = y ;
		observers = new ArrayList<I_Observer>() ;
		Subjects = new ArrayList<I_Subject>() ;
		this.chman = c;
	}
	
	@Override
	public int gethealthpoints() {
		
		return this.health;
	}

	@Override
	public void setname(String name) {
		 this.name = name;
	}

	@Override
	public String getname() {
		return this.name;
	}

	@Override
	public int getxCoord() {
		return x;
	}

	@Override
	public int getyCoord() {
		return y;
	}

	@Override
	public void setCoordinates(int x, int y) {
		this.x = x;
		this.y = y ;
	}

	@Override
	public void setxCoord(int x) {
		this.x = x;

	}

	@Override
	public void setyCoord(int y) {
		 this.y = y;
	}

	@Override
	public void draw() {
		drawing.drawEnemy(this.getxCoord(), this.getyCoord());
	}
	public String toString()
	{
		return "Enemy name: " + this.name + " " + "pos " + x + " " + y ;
	}

	@Override
	public void attach(I_Observer observer) {
		// TODO Auto-generated method stub
		chman.register(this, observer) ;
		//observers.add(observer) ;
	}
	public void attachsuib(I_Subject sub) {
		// TODO Auto-generated method stub
		Subjects.add(sub) ;
	}

	@Override
	public void detach(I_Observer observer) {
		// TODO Auto-generated method stub
		int index = this.observers.indexOf(observer);
		if(index>0)
		{
		observers.remove(observer) ;
		}
	}

	@Override
	public void notifyobservers() {
		
		// TODO Auto-generated method stub
		chman.update(this);
	}

	@Override
	public void update(I_Subject ob) {
		this.chman.update(ob) ;
		
	}
	
	public void setDrawType(Drawing drawing)
	{
		this.drawing = drawing ;
	}

	@Override
	public void sethealthpoints(int healthp) {
		// TODO Auto-generated method stub
		
	}

}
