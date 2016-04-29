import java.util.ArrayList;

public class Unshifter {

	/**
	   * This method is used for implementing circular right shifts on the encrypted bits. 
	   * The first character in the encrypted message will be go through a circular right shift by 2 bits.
	   * The second character in the encrypted message will be go through a circular right shift by 4 bits.
	   * The third character in the encrypted message will be go through a circular right shift by 6 bits.
	   * A similar trend will be followed till the end of all characters in the encrypted message.
	   * @param data This is an ArrayList of Integer[] type. Each Integer[] will carry 8 bits which will represent a character.
	   * @return unShiftedBitsBlock This is an ArrayList of Integer[] type. 
	   */
	public ArrayList<Integer[]> unShiftBits(ArrayList<Integer[]> data){
		ArrayList<Integer[]> unShiftedBitsBlock = new ArrayList<Integer[]>();
		int numbofChar = data.size();
		for(int c=0; c < numbofChar; c++){
			Integer[] unShiftedBits = new Integer[8];
			switch (c%8) {
			case 0:
				unShiftedBits = unShiftTwo(data.get(c));
				unShiftedBitsBlock.add(unShiftedBits);
				break;
				
			case 1:
				unShiftedBits = unShiftFour(data.get(c));
				unShiftedBitsBlock.add(unShiftedBits);
				break;
			
			case 2:
				unShiftedBits = unShiftSix(data.get(c));
				unShiftedBitsBlock.add(unShiftedBits);
				break;
				
			case 3:
				unShiftedBits = unShiftTwo(data.get(c));
				unShiftedBitsBlock.add(unShiftedBits);
				break;
			
			case 4:
				unShiftedBits = unShiftFour(data.get(c));
				unShiftedBitsBlock.add(unShiftedBits);
				break;
				
			case 5:
				unShiftedBits = unShiftSix(data.get(c));
				unShiftedBitsBlock.add(unShiftedBits);
				break;
				
			case 6:
				unShiftedBits = unShiftTwo(data.get(c));
				unShiftedBitsBlock.add(unShiftedBits);
				break;
			
			case 7:
				unShiftedBits = unShiftFour(data.get(c));
				unShiftedBitsBlock.add(unShiftedBits);
				break;
				
			}
		}
		return unShiftedBitsBlock;
	}

	
	/**
	   * This method is used for implementing circular right shift by 2 bits.
	   * @param data This is an array of Integer type which holds 8 bits.
	   * @return unShiftedBits This is an array of Integer type which holds the circular right shifted bits. 
	   */
	private Integer[] unShiftTwo(Integer[] data) {
		Integer[] unShiftedBits = new Integer[8];
		unShiftedBits[0] = data[6];
		unShiftedBits[1] = data[7];
		unShiftedBits[2] = data[0];
		unShiftedBits[3] = data[1];
		unShiftedBits[4] = data[2];
		unShiftedBits[5] = data[3];
		unShiftedBits[6] = data[4];
		unShiftedBits[7] = data[5];
		return unShiftedBits;
	}
	
	
	/**
	   * This method is used for implementing circular right shift by 4 bits.
	   * @param data This is an array of Integer type which holds 8 bits.
	   * @return unShiftedBits This is an array of Integer type which holds the circular right shifted bits. 
	   */
	private Integer[] unShiftFour(Integer[] data) {
		Integer[] unShiftedBits = new Integer[8];
		unShiftedBits[0] = data[4];
		unShiftedBits[1] = data[5];
		unShiftedBits[2] = data[6];
		unShiftedBits[3] = data[7];
		unShiftedBits[4] = data[0];
		unShiftedBits[5] = data[1];
		unShiftedBits[6] = data[2];
		unShiftedBits[7] = data[3];
		return unShiftedBits;
	}
	
	
	/**
	   * This method is used for implementing circular right shift by 6 bits.
	   * @param data This is an array of Integer type which holds 8 bits.
	   * @return unShiftedBits This is an array of Integer type which holds the circular right shifted bits. 
	   */
	private Integer[] unShiftSix(Integer[] data) {
		Integer[] unShiftedBits = new Integer[8];
		unShiftedBits[0] = data[2];
		unShiftedBits[1] = data[3];
		unShiftedBits[2] = data[4];
		unShiftedBits[3] = data[5];
		unShiftedBits[4] = data[6];
		unShiftedBits[5] = data[7];
		unShiftedBits[6] = data[0];
		unShiftedBits[7] = data[1];
		return unShiftedBits;
	}
}
