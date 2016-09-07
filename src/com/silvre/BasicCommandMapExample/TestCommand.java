package com.silvre.BasicCommandMapExample;

import java.util.ArrayList;
import java.util.List;

public class TestCommand implements Command {

	@Override
	public void onExecute(String aliasUsed) {
		if(aliasUsed.equals("meme")) System.out.println("Executed test command, and used alias meme!");
		else System.out.print("Executed test command, and used alias test!");
	}

	@Override
	public List<String> getAliases() {
		ArrayList<String> a = new ArrayList<>();
		a.add("test");
		a.add("meme");
		return a;
	}

}
