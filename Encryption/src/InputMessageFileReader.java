import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputMessageFileReader {
	
	public byte[] readMessageFile(String inputFilePath) throws IOException{

		Path path = Paths.get(inputFilePath);
		byte[] data = Files.readAllBytes(path);
		return data;
	}
	
}
