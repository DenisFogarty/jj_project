package State;

import java.util.List;

import factory.I_Player;
import factory.I_enemy;
import factory.Level;

public class Pause implements GameState
{
	public void stateOfGame(I_Player play,Level lev,List<I_enemy> enemyList) 
	{
		System.out.print("The game has been paused \n") ;		
	}

	@Override
	public void leftButtonAction(I_Player play) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RightButtonAction(I_Player play) {
		// TODO Auto-generated method stub
		
	}

	public void PauseGameAction(I_Player player) 
	{
		System.out.print("The game cannot change state \n") ;
	}

	public void OffGameAction(I_Player player) 
	{
		
	}

	@Override
	public void ResumeGameAction(I_Player player) {
		// TODO Auto-generated method stub
		
	}
}
