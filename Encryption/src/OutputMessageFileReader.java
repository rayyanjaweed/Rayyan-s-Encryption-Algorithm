import java.io.FileOutputStream;
import java.io.IOException;

public class OutputMessageFileReader {

	public void writeMessageFile(byte[] data, String writeFilePath) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(writeFilePath);
		fos.write(data);
		fos.close();
	}
}
