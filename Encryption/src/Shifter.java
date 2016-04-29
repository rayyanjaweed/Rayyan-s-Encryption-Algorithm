import java.util.ArrayList;

public class Shifter {

	/**
	   * This method is used for implementing circular left shifts on the user input bits. 
	   * The first character in the User's message will be go through a circular left shift by 2 bits.
	   * The second character in the User's message will be go through a circular left shift by 4 bits.
	   * The third character in the User's message will be go through a circular left shift by 6 bits.
	   * A similar trend will be followed till the end of all characters in the User's message.
	   * @param data This is an ArrayList of Integer[] type. Each Integer[] will carry 8 bits which will represent a character.
	   * @return shiftedBitsBlock This is an ArrayList of Integer[] type. 
	   */
	public ArrayList<Integer[]> shiftBits(ArrayList<Integer[]> data){
		ArrayList<Integer[]> shiftedBitsBlock = new ArrayList<Integer[]>();
		int numbofChar = data.size();
		for(int c=0; c < numbofChar; c++){
			Integer[] shiftedBits = new Integer[8];
			switch (c%8) {
			case 0:
				shiftedBits = shiftTwo(data.get(c));
				shiftedBitsBlock.add(shiftedBits);
				break;
				
			case 1:
				shiftedBits = shiftFour(data.get(c));
				shiftedBitsBlock.add(shiftedBits);
				break;
			
			case 2:
				shiftedBits = shiftSix(data.get(c));
				shiftedBitsBlock.add(shiftedBits);
				break;
				
			case 3:
				shiftedBits = shiftTwo(data.get(c));
				shiftedBitsBlock.add(shiftedBits);
				break;
			
			case 4:
				shiftedBits = shiftFour(data.get(c));
				shiftedBitsBlock.add(shiftedBits);
				break;
				
			case 5:
				shiftedBits = shiftSix(data.get(c));
				shiftedBitsBlock.add(shiftedBits);
				break;
				
			case 6:
				shiftedBits = shiftTwo(data.get(c));
				shiftedBitsBlock.add(shiftedBits);
				break;
			
			case 7:
				shiftedBits = shiftFour(data.get(c));
				shiftedBitsBlock.add(shiftedBits);
				break;
				
			}
		}
		
		return shiftedBitsBlock;
	}
	
	
	/**
	   * This method is used for implementing circular left shift by 2 bits.
	   * @param data This is an array of Integer type which holds 8 bits.
	   * @return shiftedBits This is an array of Integer type which holds the circular left shifted bits. 
	   */
	public Integer[] shiftTwo(Integer[] data){
		Integer[] shiftedBits = new Integer[8];
		shiftedBits[0] = data[2];
		shiftedBits[1] = data[3];
		shiftedBits[2] = data[4];
		shiftedBits[3] = data[5];
		shiftedBits[4] = data[6];
		shiftedBits[5] = data[7];
		shiftedBits[6] = data[0];
		shiftedBits[7] = data[1];
		return shiftedBits;
	}
	

	/**
	   * This method is used for implementing circular left shift by 4 bits.
	   * @param data This is an array of Integer type which holds 8 bits.
	   * @return shiftedBits This is an array of Integer type which holds the circular left shifted bits. 
	   */
	public Integer[] shiftFour(Integer[] data){
		Integer[] shiftedBits = new Integer[8];
		shiftedBits[0] = data[4];
		shiftedBits[1] = data[5];
		shiftedBits[2] = data[6];
		shiftedBits[3] = data[7];
		shiftedBits[4] = data[0];
		shiftedBits[5] = data[1];
		shiftedBits[6] = data[2];
		shiftedBits[7] = data[3];
		return shiftedBits;
	}
	
	
	/**
	   * This method is used for implementing circular left shift by 6 bits.
	   * @param data This is an array of Integer type which holds 8 bits.
	   * @return shiftedBits This is an array of Integer type which holds the circular left shifted bits. 
	   */
	public Integer[] shiftSix(Integer[] data){
		Integer[] shiftedBits = new Integer[8];
		shiftedBits[0] = data[6];
		shiftedBits[1] = data[7];
		shiftedBits[2] = data[0];
		shiftedBits[3] = data[1];
		shiftedBits[4] = data[2];
		shiftedBits[5] = data[3];
		shiftedBits[6] = data[4];
		shiftedBits[7] = data[5];
		return shiftedBits;
	}
	
}
