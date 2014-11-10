package command;

import factory.I_Player;

//Must have at least an execute command and must be an interface
public interface Command
{
    public void execute(I_Player player) ;
}
