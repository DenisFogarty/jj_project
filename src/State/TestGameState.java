package State;

import java.util.Scanner;

import command.Control;
import command.OffGame;
import command.PauseGame;
import command.PlayerLeft;
import command.PlayerRight;
import command.ResumeGame;

public class TestGameState 
{
	static GameMachine gameMachine = new GameMachine() ;
	static Scanner scan ;
	
	public static void main(String[] args)
	{
		gameMachine.getGameState().stateOfGame() ;
		gameMachine.setGameState(new Resume()) ;
		Control control = new Control() ;
		PlayerRight pr = new PlayerRight(gameMachine.getGameState()) ;
		PlayerLeft pl = new PlayerLeft(gameMachine.getGameState()) ;
		PauseGame pg = new PauseGame(gameMachine.getGameState()) ;
		OffGame og = new OffGame(gameMachine.getGameState()) ;
		ResumeGame rg = new ResumeGame(gameMachine.getGameState()) ;
		
		control.setCommand(pr, pl, pg, og, rg);
		
		scan = new Scanner(System.in) ;
		String line ;
		while(!(gameMachine.getGameState() instanceof Off))
		{
			System.out.print("Type start or pause or resume or off or move player \n") ;
			line = scan.nextLine() ;
			
			if(line.equals("p"))
			{	
				gameMachine.setGameState(new Pause()) ;
				control.pauseGame();
				gameMachine.getGameState().stateOfGame() ;
			}
			else if(line.equals("r"))
			{
				gameMachine.setGameState(new Resume()) ;
				control.resumeGame();
				gameMachine.getGameState().stateOfGame() ;
			}
			else if(line.equals("off"))
			{
				gameMachine.setGameState(new Off()) ;
				control.offGame();
				gameMachine.getGameState().stateOfGame() ;
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
