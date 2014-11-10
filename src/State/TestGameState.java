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
	static GameMachine gameMachine = new GameMachine() ;
	static Scanner scan ;
	static I_Player player ;
	static Level level ;
	static ArrayList<I_enemy> enemyList ;
	
	public static void main(String[] args)
	{
		gameMachine.getGameState().stateOfGame(player, level, enemyList) ;
		System.out.println() ;
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
				control.pauseGame(player);
				//gameMachine.getGameState().stateOfGame() ;
			}
			else if(line.equals("r"))
			{
				gameMachine.setGameState(new Resume()) ;
				control.resumeGame(player);
				//gameMachine.getGameState().stateOfGame() ;
			}
			else if(line.equals("off"))
			{
				gameMachine.setGameState(new Off()) ;
				control.offGame(player);
				//gameMachine.getGameState().stateOfGame() ;
			}
			else if(line.equals("a"))
			{
				control.leftButton(player);
			}
			else if(line.equals("d"))
			{
				control.rightButton(player);
			}
			else
			{
				System.out.print("Game state cannot be changed \n") ;;
			}
		}
	}
}
