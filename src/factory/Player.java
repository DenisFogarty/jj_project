package factory;

import java.util.ArrayList;
import java.util.List;

import observer.ChangeManager;
import observer.I_Observer;
import observer.I_Subject;
import bridge.Drawing;
import bridge.Shape;

public class Player extends Shape implements I_Player,GameEntity
{
	private String name ;
	private int x,y,health ;
    private List<I_Observer> observers ;
    private ChangeManager chman ;
    private Drawing drawing ;

	Player(String name, int health,int x,int y,ChangeManager c)
	{
		
		this.name = name ;
		this.health = health;
		this.x = x;
		this.y = y ;
		observers = new ArrayList<I_Observer>();
		this.chman = c;
	}
	@Override
	public void setname(String name) {

		 this.name = name ;
	}

	@Override
	public String getname() {
		return name ;
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
	public void setxCoord(int x) {
		this.x = x ;		
	}

	@Override
	public void setyCoord(int y) {
		this.y = y ;		
	}

	@Override
	public void draw() {
		 drawing.drawPlayer(this.getxCoord(), this.getyCoord());
	}

	@Override
	public int gethealth() {// TODO Auto-generated method stub
		return this.health;
	}

	@Override
	public void sethealthpoints(int healthp) {
		this.health = healthp ;
	}

	@Override
	public void setCoordinates(int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	
	public String toString()
	{
		return "Player name: " + this.name + " " + "pos " + x + " " + y ;
	}
	
	public void attach(I_Observer observer) {
		chman.register(this, observer) ;
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
	
	public void move() 
	{
		this.setCoordinates(50, 60) ;
		notifyobservers();
	}
	
	@Override
	public void notifyobservers() {
		//System.out.println(observers.get(0));
	
		chman.update(this);	
	}
	@Override
	public void update(I_Subject ob) {
		this.chman.update(ob) ;
	
	}
	@Override
	public void moveleft() {
		this.setxCoord(getxCoord()-2);
		notifyobservers();
	}
	@Override
	public void moveRight() {
		this.setxCoord(getxCoord()+2);
		notifyobservers();
	}
	
	public void setDrawType(Drawing drawing)
	{
		this.drawing = drawing ;
	}
}
