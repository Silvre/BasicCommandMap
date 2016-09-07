package com.silvre.BasicCommandMapExample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws CommandRegisterException	{
		BasicCommandMap m = new BasicCommandMap();
		m.register(new TestCommand());
		m.register(new TestCommandTwo());
		Scanner s = new Scanner(System.in);
		String test = s.next();
		m.executeCommand(test);
		s.close();
	}
}
