package State;

import java.util.List;

import factory.I_Player;
import factory.I_enemy;
import factory.Level;

public class Resume implements GameState
{
	
	private GameEngine engine ;
	
	public Resume(GameEngine engine)
	{
		this.engine = engine ;
	}
	public void stateOfGame() 
	{
		engine.startgame(false);
		System.out.print("The game has resumed \n") ;		
	}

	public void leftButtonAction()
	{
		engine.movePlayerL();
		System.out.print("Player moves left \n") ;
	}

	public void RightButtonAction() 
	{
		engine.movePlayerR();
		System.out.print("Player moves right \ns") ;
	}

	public void PauseGameAction()
	{
	}

	public void OffGameAction()
	{
	}

	public void ResumeGameAction() 
	{
	}
}
