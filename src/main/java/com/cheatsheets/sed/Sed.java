package com.cheatsheets.sed;

import picocli.CommandLine.Command;

@Command(name = "sed")
public class Sed implements Runnable {

	@Override
	public void run() {
		System.out.println("SED (Stream Editor) is used to replace strings in a file");
		System.out.println("example: replaces all occurances of regular expression x with y in file named filename");
		System.out.println("sed 's/x/y/' filename");
	}
}
