package com.silvre.BasicCommandMapExample;

import java.util.ArrayList;
import java.util.List;

public class TestCommandTwo implements Command {

	@Override
	public void onExecute(String aliasUsed) {
		System.out.println("Test command 2 works!");

	}

	@Override
	public List<String> getAliases() {
		List<String> s = new ArrayList<>();
		s.add("test2");
		return s;
	}

}
