import java.util.ArrayList;
import java.util.BitSet;

public class BitBlockCreator {

	public ArrayList<Integer[]> createBitBlocks(byte[] data){
		int numbOfChar = data.length;
		ArrayList<Integer[]> bitBlocks = new ArrayList<Integer[]>();
		
		for(int c=0; c < numbOfChar; c++){
			BitSet bits = new BitSet(8);
			bits = fromByte(data[c]);
			Integer[] oneChar = new Integer[8];
			oneChar[0] = bits.get(7) ? 1 : 0;
			oneChar[1] = bits.get(6) ? 1 : 0;
			oneChar[2] = bits.get(5) ? 1 : 0;
			oneChar[3] = bits.get(4) ? 1 : 0;
			oneChar[4] = bits.get(3) ? 1 : 0;
			oneChar[5] = bits.get(2) ? 1 : 0;
			oneChar[6] = bits.get(1) ? 1 : 0;
			oneChar[7] = bits.get(0) ? 1 : 0;
			bitBlocks.add(oneChar);
		}
		return bitBlocks;
	}
	
	public BitSet fromByte(byte b)
	{
	    BitSet bits = new BitSet(8);
	    for (int i = 0; i < 8; i++)
	    {
	        bits.set(i, (b & 1) == 1);
	        b >>= 1;
	    }
	    return bits;
	}
}
