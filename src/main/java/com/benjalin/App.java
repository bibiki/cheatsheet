package com.benjalin;

import com.benjalin.cheatsheets.Clojure;
import com.benjalin.cheatsheets.Sed;
import com.benjalin.cheatsheets.StartANewCheatsheet;

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
//		args = new String[7];
//		args[0] = "add";
//		args[1] = "--name";
//		args[5] = "--rewrite";
//		args[6] = "0";
//		args[2] = "cheatsheet";
//		args[3] = "-d";
//		args[4] = "removing";
		int exitCode = new CommandLine(new App()).execute(args); 
        System.exit(exitCode);
	}
}
