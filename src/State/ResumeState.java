package State;

public class ResumeState implements GameState
{
	
	private GameEngine engine ;
	
	public ResumeState(GameEngine engine)
	{
		this.engine = engine ;
	}
	public void stateOfGame() 
	{
		System.out.print("resumed \n") ;		
	}

	//moves the player left by 2 and redraws the player at those co-ordinates
	public void leftButtonAction()
	{
		engine.movePlayerL();
		System.out.print("Player moves left " + engine.getLevel().getPlayer().getxCoord() + " " + engine.getLevel().getPlayer().getyCoord() + "\n") ;
		engine.getLevel().getPlayer().draw();
	}
	//moves the player right by 2 and redraws the player at those co-ordinates
	public void RightButtonAction() 
	{
		engine.movePlayerR();
		System.out.print("Player moves right " + engine.getLevel().getPlayer().getxCoord() + " " + engine.getLevel().getPlayer().getyCoord() + "\n") ;
		engine.getLevel().getPlayer().draw();
	}

	//sets the state to pause
	public void PauseGameAction()
	{
		engine.setGameState(new PauseState(engine));
		System.out.print("The game has paused \n") ;
	}

	public void OffGameAction()
	{
	}

	//is called when already in resume state
	public void ResumeGameAction() 
	{
		System.out.print("The game cannot change state \n") ;
	}
}
