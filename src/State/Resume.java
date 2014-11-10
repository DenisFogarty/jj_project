package State;

import java.util.List;

import factory.I_Player;
import factory.I_enemy;
import factory.Level;

public class Resume implements GameState
{
	
	public void stateOfGame(I_Player play,Level lev,List<I_enemy> enemyList) 
	{
		System.out.print("The game has resumed \n") ;		
	}

	public void leftButtonAction(I_Player player)
	{
		
		System.out.print("Player moves left \n") ;
	}

	public void RightButtonAction(I_Player player) 
	{
		player.move();
		System.out.print("Player moves right \ns") ;
	}

	public void PauseGameAction(I_Player player) 
	{
	}

	public void OffGameAction(I_Player player)
	{
	}

	public void ResumeGameAction(I_Player player) 
	{
	}
}
