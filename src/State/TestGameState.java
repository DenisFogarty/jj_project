package State;

import java.util.Scanner;

import command.Command;
import command.Control;
import command.OffGame;
import command.PauseGame;
import command.PlayerLeft;
import command.PlayerRight;
import command.ResumeGame;

public class TestGameState 
{	
	public static void main(String[] args)
	{
		GameEngine newGame = new GameEngine() ;
		newGame.startgame(true);
		System.out.print("The game has started \n") ;
		newGame.setGameState(new Resume(newGame));
		
		Control control = new Control() ;
		Command pr = new PlayerRight(newGame) ;
		Command pl = new PlayerLeft(newGame) ;
		Command pg = new PauseGame(newGame) ;
		Command og = new OffGame(newGame) ;
		Command rg = new ResumeGame(newGame) ;
		
		control.setCommand(pr, pl, pg, og, rg);
		
		Scanner scan = new Scanner(System.in) ;
		String line ;
		while(!(newGame.getGameState() instanceof Off))
		{
			System.out.print("Type pause or resume or off or move player \n") ;
			line = scan.nextLine() ;
			
			if(line.equals("p"))
			{	
				//newGame.setGameState(new Pause(newGame)) ;
				control.pauseGame();
				//newGame.getGameState().stateOfGame() ;
			}
			else if(line.equals("r"))
			{ 
				//newGame.setGameState(new Resume(newGame)) ;
				control.resumeGame();
				//gameMachine.getGameState().stateOfGame() ;
			}
			else if(line.equals("off"))
			{
				//newGame.setGameState(new Off()) ;
				control.offGame();
				//gameMachine.getGameState().stateOfGame() ;
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
