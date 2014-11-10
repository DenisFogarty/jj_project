package factory;

import java.util.ArrayList;

public class Level {
	
	private int width ;
	private int height ; 
	private ArrayList<I_enemy> EnemyList ;
	private ArrayList<I_Obstacle> obstacles ;

	public Level(int width,int height)
	{
		this.width = width ;
		this.height = height ;
		EnemyList = new ArrayList<I_enemy>() ;
		
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<I_enemy> getEnemyList() {
		return EnemyList;
	}

	public void setEnemyList(ArrayList<I_enemy> enemyList) {
		EnemyList = enemyList;
	}
    
	public void addEnemy(I_enemy en)
	{
		if (this.EnemyList ==null)
		{
			EnemyList = new  ArrayList<I_enemy>() ;
		}
		
		if(EnemyList.contains(en)!= true)
		{
			EnemyList .add(en) ;
			System.out.println("Enemy "+ en.getname() + " added to level") ;
		} 
		
	}
	
	public ArrayList<I_Obstacle> getObstacles() {
		return obstacles;
	}

	public void setObstacles(ArrayList<I_Obstacle> obstacles) {
		this.obstacles = obstacles;
	}
	
	public void addEnemy(I_Obstacle ob)
	{
		if (this.obstacles ==null)
		{
			obstacles = new  ArrayList<I_Obstacle>() ;
		}
		
		if(obstacles.contains(ob)!= true)
		{
			obstacles .add(ob) ;
			
		} 
		
	}
	
	
	
	
}
