package factory;

import java.util.ArrayList;
import java.util.List;

import observer.ChangeManager;
import observer.I_Observer;
import observer.I_Subject;
import bridge.Drawing;

//Should this be abstract?
public class Enemy implements I_enemy,GameEntity {

	private String name ;
	private int x,y,health ;
    private ChangeManager chman ;
    private Drawing drawing ;
    
	public Enemy( String name, int health,int x,int y,ChangeManager c)
	{
		this.name = name ;
		this.health = health;
		this.x = x;
		this.y = y ;
		
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
		chman.register(this, observer) ;

	}

	@Override
	public void detach(I_Observer observer) {
	
		chman.register(this, observer);
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
		this.health = healthp ;
	}

}
