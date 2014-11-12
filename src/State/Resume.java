package State;

public class Resume implements GameState
{
	
	private GameEngine engine ;
	
	public Resume(GameEngine engine)
	{
		this.engine = engine ;
	}
	public void stateOfGame() 
	{
		System.out.print("resumed \n") ;		
	}

	public void leftButtonAction()
	{
		engine.movePlayerL();
		System.out.print("Player moves left " + engine.getLevel().getPlayer().getxCoord() + " " + engine.getLevel().getPlayer().getyCoord() + "\n") ;
		engine.getLevel().getPlayer().draw();
	}

	public void RightButtonAction() 
	{
		engine.movePlayerR();
		System.out.print("Player moves right " + engine.getLevel().getPlayer().getxCoord() + " " + engine.getLevel().getPlayer().getyCoord() + "\n") ;
		engine.getLevel().getPlayer().draw();
	}

	public void PauseGameAction()
	{
		engine.setGameState(new Pause(engine));
		System.out.print("The game has beehinkhbiub,uhbniuhn paused \n") ;
	}

	public void OffGameAction()
	{
	}

	public void ResumeGameAction() 
	{
		System.out.print("The game cannot change state \n") ;
	}
}
