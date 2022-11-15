package com.cheatsheets;

import com.cheatsheets.clojure.Clojure;
import com.cheatsheets.general.StartANewCheatsheet;
import com.cheatsheets.sed.Sed;

import picocli.CommandLine;
import picocli.CommandLine.Command;

/**
 * Hello world!
 *
 */
@Command(name = "cheatsheet",
		subcommands = {Sed.class,
					Clojure.class,
					StartANewCheatsheet.class}, version = "cheatsheet 1.0", mixinStandardHelpOptions = true)
public class App implements Runnable {
	
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		args = new String[2];
		args[0] = "clojure";
		args[1] = "one";
//		args[2] = "repl";
		int exitCode = new CommandLine(new App()).execute(args); 
        System.exit(exitCode);
	}
}
