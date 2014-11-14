package factory;

import java.util.ArrayList;

import Flyweight.I_GameWorld_Object;
import Flyweight.I_enemy;

public interface I_Level {

	public void addPlayer(I_Player player);
	public I_Player getPlayer();
	public int getWidth();
	public void setWidth(int width);
	public int getHeight();
	public void setHeight(int height) ;
	public ArrayList<I_enemy> getEnemyList() ;
	public void setEnemyList(ArrayList<I_enemy> enemyList);
	public void addEnemy(I_enemy en);
	public ArrayList<I_GameWorld_Object> getObstacles() ;
	public void setObstacles(ArrayList<I_GameWorld_Object> obstacles);
	public void addObstacle(I_GameWorld_Object ob) ;
	
}
