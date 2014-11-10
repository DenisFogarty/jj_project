package command;

import factory.I_Player;
import State.GameState;

//Concrete class
public class PlayerLeft implements Command
{
	GameState targetState ;
	
	public PlayerLeft(GameState state)
	{
		this.targetState = state ;
	}

	public void execute(I_Player player)
	{
		this.targetState.leftButtonAction(player); ; 
	}
}
