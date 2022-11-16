package com.cheatsheets.clojure;

import picocli.CommandLine.Command;

@Command(name = "documentation", aliases = {"docs"})
public class Documentation implements Runnable {

	@Override
	public void run() {
		System.out.println("assuming you are in a Clojure repl, you can:");
		System.out.println("(require 'clojure.string 'clojure.repl)");
		System.out.println("(clojure.repl/dir clojure.string)");
		System.out.println("as a result of that sequence of commands, you will be shown the content of clojure.string package");
		System.out.println("something like:");
		System.out.println("blank?");
		System.out.println("capitalize");
		System.out.println("...");
		System.out.println();
		System.out.println("you might as well try the following");
		System.out.println("(clojure.repl/dir clojure.repl)");
	}
}
