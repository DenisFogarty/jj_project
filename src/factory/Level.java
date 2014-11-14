package factory;

import java.util.ArrayList;

public class Level implements I_Level {
	
	private int width ;
	private int height ; 
	private ArrayList<I_enemy> EnemyList ;
	private ArrayList<I_GameWorld_Object> obstacles ;
    private I_Player Player ;
	public Level(int width,int height)
	{
		this.width = width ;
		this.height = height ;
		EnemyList = new ArrayList<I_enemy>() ;
		
		
	}

	
	public void addPlayer(I_Player player)
	{
		if(player.getxCoord()> width -1)
		{
			System.out.println("Player position out of bounds..recalcualting") ;
			player.setCoordinates(width/3, 0);
		}
		
		this.Player = player ;
	}
	
	public I_Player getPlayer()
	{
		return this.Player ;
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
	
	public ArrayList<I_GameWorld_Object> getObstacles() {
		return obstacles;
	}

	public void setObstacles(ArrayList<I_GameWorld_Object> obstacles) {
		this.obstacles = obstacles;
	}
	
	public void addObstacle(I_GameWorld_Object ob)
	{
		if (this.obstacles ==null)
		{
			obstacles = new  ArrayList<I_GameWorld_Object>() ;
		}
		
		if(obstacles.contains(ob)!= true)
		{
			obstacles .add(ob) ;
			
		} 
		
	}
	
	
	
	
}
