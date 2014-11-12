package command;

import factory.I_Player;
import State.GameState;

//Concrete command class
public class PauseGame implements Command
{
	GameState targetState ;
	
	public PauseGame(GameState state)
	{
		this.targetState = state ;
	}
	
	public void execute() 
	{
		this.targetState.PauseGameAction() ;
	}

}
