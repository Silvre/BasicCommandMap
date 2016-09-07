package com.silvre.BasicCommandMapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicCommandMap {
	private Map<String, Command> cmds = new HashMap<>();
	
	public void register(Command cmd) throws CommandRegisterException	{
		if(cmds.containsValue(cmd)) throw new CommandRegisterException("Command already exists!");
		else	{
			//Check to make sure there are no taken aliases
			for(String s : cmd.getAliases())	{
				if(cmds.containsKey(s))	{
					throw new CommandRegisterException("Alias " + s + " already being used!");
				}
			}
			//The following code will only execute if the for loop above checks that all the aliases are not being used.
			for(String s : cmd.getAliases())	{
				cmds.put(s, cmd);
			}
		}
	}
	 
	/**
	 * Unregister a specified command.  Return true/false depending on whether the action was successful or not.
	 * @param cmd
	 * @return
	 */
	public boolean unRegister(Command cmd)	{
		if(cmds.containsValue(cmd)) return false;
		else	{
			for(String s : cmd.getAliases()) cmds.remove(s);
			return true;
		}
	}
	
	/**
	 * Checks to see if the command map has registered the specified command.  Return true/false if the command is registered or not.
	 * @param cmd
	 * @return
	 */
	public boolean isRegistered(Command cmd)	{
		if(cmds.containsValue(cmd)) return true;
		else return false;
	}
	
	public boolean unRegisterAlias(String alias)	{
		if(cmds.containsKey(alias))	{
			cmds.remove(alias);
			return true;
		}
		else return false;
	}

	public void executeCommand(String s)	{
		if(cmds.containsKey(s)) cmds.get(s).onExecute(s);
	}
}
