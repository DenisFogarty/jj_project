package State;

import java.util.ArrayList;

import bridge.Drawing;
import bridge.G1_Draw;
import factory.ChangeManager;
import factory.FactoryCreator;
import factory.I_Player;
import factory.I_enemy;
import factory.Level;



public class GameEngine {

	private GameState currentState ; 
	private Level level ;
	private I_Player player ;
	private ArrayList<I_enemy> enemyList ;
	private ChangeManager change ;
	Drawing g1 = new G1_Draw() ;


	public void startgame(boolean startState)
	{
		if(startState ==true)
		{
			change = new ChangeManager();
			enemyList = new ArrayList<I_enemy>() ;
			player = (I_Player) FactoryCreator.getFactory("player").createGameobject("player","Playa",201,0,56,change) ;
			player.setDrawType(g1) ;
			player.draw();

			String[] enemyType = {"small enemy", "regular enemy", "large enemy"} ; 
			level = new Level(200, 100) ;
			level.addPlayer(player);
			for(int i = 0 ; i <= Math.random()*100 ; i++) 
			{
				int xpos = level.getWidth()/2 + (int)Math.random()* (level.getWidth() - level.getWidth()/2) ;
				int ypos = level.getHeight()/2 + (int)Math.random()* (level.getHeight() - level.getHeight()/2) ;
				int temp = (int)Math.random()*3 ;
				enemyList.add(FactoryCreator.getFactory(enemyType[temp]).createEnemy(enemyType[temp], "Enemy" + i, xpos, ypos, change));
				enemyList.get(i).setDrawType(g1) ;
				enemyList.get(i).draw();
				player.attach(enemyList.get(i));
				enemyList.get(i).attach(player);
			}

			for(int i = 0 ; i < enemyList.size() ; i++)
			{
				for(int j = 0 ; j < enemyList.size() ; j++)
				{
					if(j != i)
					{
						enemyList.get(i).attach(enemyList.get(j));
					}
				}
			}

			System.out.println(player.toString());
		}
	}


	public void movePlayerL(){
		if(player.getxCoord()!=0)
		{
			player.moveleft() ;
		}
	}

	public void movePlayerR(){
		if(player.getxCoord() <=level.getWidth()-2)
		{
			player.moveRight() ;
		}
	}


	public void setGameState(GameState gs)
	{
		currentState= gs ;
	}

	public  GameState getGameState()
	{
		return currentState;
	}

	public void Pause()
	{
		System.out.println("Game has been paused");
	}

	public Level getLevel()
	{
		return level ;
	}


}
