package com.silvre.BasicCommandMapExample;

import java.util.ArrayList;
import java.util.List;

public interface Command {
	
	public void onExecute(String aliasUsed);
	
	public List<String> getAliases();
}
