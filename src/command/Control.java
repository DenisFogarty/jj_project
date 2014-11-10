package command;

import factory.I_Player;


//Creates the commands
public class Control
{  
    Command right ;
    Command left ;
    Command pause ;
    Command off ;
    Command resume ;
    
    public Control()
    {
    }

    public void setCommand(Command right, Command left, Command pause, Command off, Command resume)
    {
        this.right = right ;
        this.left = left ;
        this.pause = pause ;
        this.off = off ;
        this.resume = resume ;
    }
    
    public void rightButton(I_Player player)
    {
    	right.execute(player) ;
    }
    
    public void leftButton(I_Player player)
    {
    	left.execute(player) ;
    }
    
    public void pauseGame(I_Player player)
    {
    	pause.execute(player) ;
    }
    
    public void offGame(I_Player player)
    {
    	off.execute(player) ;
    }
    
    public void resumeGame(I_Player player)
    {
    	resume.execute(player) ;
    }
}
