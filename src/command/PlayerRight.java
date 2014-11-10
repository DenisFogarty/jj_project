package command;

import factory.I_Player;
import State.GameState;

//Concrete class
public class PlayerRight implements Command
{
	GameState targetState ;
	
	public PlayerRight(GameState state)
	{
		this.targetState = state ;
	}

	public void execute(I_Player player)
	{
		this.targetState.RightButtonAction(player) ; 
	}
}
