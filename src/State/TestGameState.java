package State;

import java.util.Scanner;

import command.Command;
import command.Control;
import command.OffGameCommand;
import command.PauseGameCommand;
import command.PlayerLeftCommand;
import command.PlayerRightCommand;
import command.ResumeGameCommand;

public class TestGameState 
{	
	public static void main(String[] args)
	{
		GameEngine newGame = new GameEngine() ;
		newGame.startgame(true);
		System.out.print("The game has started \n") ;
		newGame.setGameState(new ResumeState(newGame));
		
		Control control = new Control() ;
		Command pr = new PlayerRightCommand(newGame) ;
		Command pl = new PlayerLeftCommand(newGame) ;
		Command pg = new PauseGameCommand(newGame) ;
		Command og = new OffGameCommand(newGame) ;
		Command rg = new ResumeGameCommand(newGame) ;
		
		control.setCommand(pr, pl, pg, og, rg);
		
		Scanner scan = new Scanner(System.in) ;
		String line ;
		while(!(newGame.getGameState() instanceof OffState))
		{
			System.out.print("Type pause or resume or off or move player \n") ;
			line = scan.nextLine() ;
			
			if(line.equals("p"))
			{	
				control.pauseGame();
			}
			else if(line.equals("r"))
			{ 
				control.resumeGame();
			}
			else if(line.equals("off"))
			{
				control.offGame();
			}
			else if(line.equals("a"))
			{
				control.leftButton();
			}
			else if(line.equals("d"))
			{
				control.rightButton();
			}
			else
			{
				System.out.print("Game state cannot be changed \n") ;;
			}
		}
	}
}
