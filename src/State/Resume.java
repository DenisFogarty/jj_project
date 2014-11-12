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
		engine.startgame(false);
		System.out.print("The game has resumed \n") ;		
	}

	public void leftButtonAction()
	{
		engine.movePlayerL();
		System.out.print("Player moves left " + engine.getLevel().getPlayer().getxCoord() + " " + engine.getLevel().getPlayer().getyCoord() + "\n") ;
	}

	public void RightButtonAction() 
	{
		engine.movePlayerR();
		System.out.print("Player moves right " + engine.getLevel().getPlayer().getxCoord() + " " + engine.getLevel().getPlayer().getyCoord() + "\n") ;
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
