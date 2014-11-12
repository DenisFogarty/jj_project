package State;

import java.util.ArrayList;
import java.util.Scanner;

import command.Control;
import command.OffGame;
import command.PauseGame;
import command.PlayerLeft;
import command.PlayerRight;
import command.ResumeGame;
import factory.I_Player;
import factory.I_enemy;
import factory.Level;

public class TestGameState 
{
//	static GameMachine gameMachine = new GameMachine() ;
//	static Scanner scan ;
//	static I_Player player ;
//	static Level level ;
//	static ArrayList<I_enemy> enemyList ;
	
	public static void main(String[] args)
	{
		GameEngine newGame = new GameEngine() ;
		//gameMachine.getGameState().stateOfGame() ;
		System.out.println() ;
		//gameMachine.setGameState(new Resume()) ;
		newGame.setGameState(newGame.getStartsate() );
		newGame.getStartsate().stateOfGame();
		Control control = new Control() ;
		PlayerRight pr = new PlayerRight(newGame.getResume()) ;
		PlayerLeft pl = new PlayerLeft(newGame.getResume()) ;
		PauseGame pg = new PauseGame(newGame.getGameState()) ;
		OffGame og = new OffGame(newGame.getGameState()) ;
		ResumeGame rg = new ResumeGame(newGame.getGameState()) ;
		
		control.setCommand(pr, pl, pg, og, rg);
		
		Scanner scan = new Scanner(System.in) ;
		String line ;
		while(!(newGame.getGameState() instanceof Off))
		{
			System.out.print("Type start or pause or resume or off or move player \n") ;
			line = scan.nextLine() ;
			
			if(line.equals("p"))
			{	
				newGame.setGameState(newGame.getPause()) ;
				control.pauseGame();
				//gameMachine.getGameState().stateOfGame() ;
			}
			else if(line.equals("r"))
			{ 
				newGame.setGameState(newGame.getResume()) ;
				control.resumeGame();
				//gameMachine.getGameState().stateOfGame() ;
			}
			else if(line.equals("off"))
			{
				//gameMachine.setGameState(new Off()) ;
			//	control.offGame(player);
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
