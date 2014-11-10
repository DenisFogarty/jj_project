package command;

import factory.I_Player;
import State.GameState;

//Concrete class
public class OffGame implements Command
{
	GameState targetState ;
	
	public OffGame(GameState state)
	{
		this.targetState = state ;
	}

	public void execute(I_Player player)
	{
		this.targetState.OffGameAction(player); ; 
	}
}