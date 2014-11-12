package State;

import java.util.List;

import factory.I_Player;
import factory.I_enemy;
import factory.Level;

public class Pause implements GameState
{
	
	private GameEngine engine ;
	public Pause(GameEngine gameEngine) {
		this.engine = gameEngine ;
	}

	public void stateOfGame() 
	{
		engine.startgame(false);
		System.out.print("The game has already  started") ;		
	}

	@Override
	public void leftButtonAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RightButtonAction() {
		// TODO Auto-generated method stub
		
	}

	public void PauseGameAction() 
	{
		engine.setGameState(engine.getPause());
		System.out.print("The game cannot change state \n") ;
	}

	public void OffGameAction() 
	{
		
	}

	@Override
	public void ResumeGameAction() {
		// TODO Auto-generated method stub
		
	}
}
