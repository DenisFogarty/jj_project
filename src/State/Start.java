package State;

import java.util.ArrayList;
import java.util.List;

import factory.ChangeManager;
import factory.Enemy;
import factory.FactoryCreator;
import factory.I_Player;
import factory.I_enemy;
import factory.Level;

public class Start implements GameState
{
	public void stateOfGame(I_Player player,Level lev,List<I_enemy> enemyList) 
	{		
		ChangeManager change = new ChangeManager();
		enemyList = new ArrayList<I_enemy>() ;
		Enemy enemy2 = FactoryCreator.getFactory("small enemy").createEnemy("small enemy", "George", 75, 30, change);
		player = (I_Player) FactoryCreator.getFactory("player").createGameobject("player","Playa",200,0,56,change) ;
		
		String[] enemyType = {"small enemy", "regular enemy", "large enemy"} ; 
		lev = new Level(200, 100) ;
		for(int i = 0 ; i <= Math.random()*100 ; i++)
		{
			int temp = (int)Math.random()*3 ;
			enemyList.add(FactoryCreator.getFactory(enemyType[temp]).createEnemy(enemyType[temp], "Enemy" + i, 75, 30, change));
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
		
		System.out.println(enemy2.toString()) ;
		System.out.println(player.toString());
		
		System.out.print("The game has started \n") ;
	}

	@Override
	public void leftButtonAction(I_Player play) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RightButtonAction(I_Player play) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PauseGameAction(I_Player play) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OffGameAction(I_Player play) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ResumeGameAction(I_Player play) {
		// TODO Auto-generated method stub
		
	}
}