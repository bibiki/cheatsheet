package com.benjalin.cheatsheets;

import picocli.CommandLine.Command;

@Command(name = "awk")
public class Awk implements Runnable {

	@Override
	public void run() {
		System.out.println("AWK is a programming language used to manipulate data");
		System.out.println("Assuming that you have a file named someFileName with the following content:");
		System.out.println("one:two:three");
		System.out.println("four:five:six");
		System.out.println("then the following command: ");
		System.out.println("awk -F: '${print $2}' someFileName");
		System.out.println("will show you the following output");
		System.out.println("two");
		System.out.println("five");
	}
}
