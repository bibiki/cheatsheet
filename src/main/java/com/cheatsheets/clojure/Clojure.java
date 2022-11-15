package com.cheatsheets.clojure;

import picocli.CommandLine.Command;

@Command(name = "clojure",
	subcommands = {Sets.class}, version = "clojure cheatsheet version 1.0", aliases = {"clj"}, mixinStandardHelpOptions = true)
public class Clojure implements Runnable {

	@Override
	public void run() {
		System.out.println("clojure cheatsheet");
	}
}
