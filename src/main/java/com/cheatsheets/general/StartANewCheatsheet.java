package com.cheatsheets.general;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "addcheatsheet", aliases = {"add", "newcheatsheet"})
public class StartANewCheatsheet implements Runnable {

	@Option(names = {"--name"}, description = "a name for the file where you will store information for your cheatsheet. Best to use the name of the program or utility you want to have a cheatsheet for")
	String name;
	@Option(names = {"--rewrite"}, description = "default value 0. if greater than 0, the file corresponding to this cheatsheet is appended to, else it is overwritten")
	int rewrite = 0;
	@Option(names = {"--description", "-d"}, description = "the cheatsheet content. a one-line description you want to append to your cheatsheet's description content")
	String description;
	
	@Override
	public void run() {
		
		try {
			
			name += ".txt";
			Path location = Path.of(cheatsheetLocation());
			Files.createDirectories(location);
			File file = new File(location.toFile(), name);
			if(rewrite > 0) {
				String existingContent = getExistingContent(file.toPath());
				description = existingContent + "\n" + description;
			}
			
			Files.writeString(file.toPath(), description);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String getExistingContent(Path file) throws IOException {
		return Files.readString(file);
	}
	
	private String cheatsheetLocation() {
		String s = System.getProperty("user.home");
		s += "/.cheatsheet/";
		return s;
	}
}
