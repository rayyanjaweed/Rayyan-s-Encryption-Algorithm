import java.util.ArrayList;

public class ByteArrayCreator {

	public byte[] createByteArray(ArrayList<Integer[]> shiftedBitBlocks){
		int numbOfChar = shiftedBitBlocks.size();
		byte[] data = new byte[numbOfChar];
		for(int c = 0; c < numbOfChar; c++){
			int decNumb = 0;
			for(int i=0; i < 8; i++){
				decNumb = (decNumb * 10) + shiftedBitBlocks.get(c)[i];
			}
			decNumb = Integer.parseInt(decNumb+"",2);
			data[c] = (byte)decNumb;
		}
		
		return data;
	}
}
