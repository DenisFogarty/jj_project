package command;

//Creates the commands going to be used by the program
public class Control
{  
	Command right ;
	Command left ;
	Command pause ;
	Command off ;
	Command resume ;

	public void setCommand(Command right, Command left, Command pause, Command off, Command resume)
	{
		this.right = right ;
		this.left = left ;
		this.pause = pause ;
		this.off = off ;
		this.resume = resume ;
	}

	public void rightButton()
	{
		right.execute() ;
	}

	public void leftButton()
	{
		left.execute() ;
	}

	public void pauseGame()
	{
		pause.execute() ;
	}

	public void offGame()
	{
		off.execute() ;
	}

	public void resumeGame()
	{
		resume.execute() ;
	}
}
