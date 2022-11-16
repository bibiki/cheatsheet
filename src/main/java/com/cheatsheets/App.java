package com.cheatsheets;

import com.cheatsheets.clojure.Clojure;
import com.cheatsheets.general.StartANewCheatsheet;
import com.cheatsheets.sed.Sed;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "cheatsheet",
	subcommands = {Sed.class,
			Clojure.class,
			StartANewCheatsheet.class}, version = "cheatsheet 1.0", mixinStandardHelpOptions = true)
public class App implements Runnable {
	
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		args = new String[3];
		args[0] = "clojure";
		args[1] = "transducers";
		args[2] = "take-while";
		int exitCode = new CommandLine(new App()).execute(args); 
        System.exit(exitCode);
	}
}
