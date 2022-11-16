package com.cheatsheets.clojure;

import picocli.CommandLine.Command;

@Command(name = "datatypes", mixinStandardHelpOptions = true)
public class Datatypes implements Runnable {

	@Override
	public void run() {
		System.out.println("each data type that Clojure supports is a subcommand to: clojure datatypes");
		System.out.println("primitive data types in Clojure are:");
		System.out.println("numbers");
		System.out.println("strings");
		System.out.println("characters");
		System.out.println("keywords");
		System.out.println("symbols");
		System.out.println("misc");
	}
	
	
	@Command(name = "numbers")
	public void numbers() {
		System.out.println("Clojure supports numbers as a primitive data type");
	}
	
	@Command(name = "strings")
	public void strings() {
		System.out.println("Clojure supports strings as a primitive data type");
		System.out.println("some string literals:");
		System.out.println("\"one\", \"another\", \"\\a\"");
	}
	
	@Command(name = "charachters")
	public void characters() {
		System.out.println("Clojure supports characters as a primitive data type");
		System.out.println("some character literals:");
		System.out.println("\\a, \\newline, \1");
	}
	
	@Command(name = "keywords")
	public void keywords() {
		System.out.println("Clojure supports keywords as a primitive data type");
		System.out.println("some keyword literals:");
		System.out.println(":key, :my.name.space/key");
		System.out.println("one way they are frequently used is as keys in maps");
	}
	
	@Command(name = "symbols")
	public void symbols() {
		System.out.println("Clojure supports symbols as a primitive data typeo");
	}
}
