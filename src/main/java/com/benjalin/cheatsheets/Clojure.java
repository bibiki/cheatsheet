package com.benjalin.cheatsheets;

import picocli.CommandLine.Command;

@Command(name = "clojure", aliases = {"clj"})
public class Clojure implements Runnable {

	@Override
	public void run() {
		System.out.println("clojure cheatsheet");
	}
}
