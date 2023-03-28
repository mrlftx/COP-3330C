package Poem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Remover {
	
	
	public void removeHTML(Path path, String s1, String s2, String output) throws IOException {
		String holder = new String();
		File out = new File(output);
		FileWriter writer = new FileWriter ("output.txt", false);
		try {
			holder = Files.readString(path);
			holder = holder.replaceAll("<[^>]*>", "");
			//holder = holder.substring(holder.indexOf("The Raven\n\nby Edgar Allan Poe"), holder.indexOf("\n\n*** END"));
			holder = holder.substring(holder.indexOf(s1), holder.indexOf(s2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.write(holder);
		writer.flush();
	}
}
