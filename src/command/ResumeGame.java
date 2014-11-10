package command;

import factory.I_Player;
import State.GameState;

//Concrete command class
public class ResumeGame implements Command
{
	GameState targetState ;
	
	public ResumeGame(GameState state)
	{
		this.targetState = state ;
	}
	
	public void execute(I_Player player) 
	{
		this.targetState.ResumeGameAction(player) ;
	}

}