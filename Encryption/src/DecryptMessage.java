import java.util.ArrayList;


public class DecryptMessage {

	public byte[] decryptCipherMessage(byte[] cipherData, String privateKey){
		
		byte[] decryptData = "".getBytes();
		
		//Create a private key
		byte[] cipherKey = new byte[8];
		KeyCreator kCreator = new KeyCreator();
		cipherKey = kCreator.generateCipherKeyDecryption(privateKey);
		System.out.println("Modified cipher key for decryption = {"+cipherKey[0]+","+cipherKey[1]+","+cipherKey[2]+","+cipherKey[3]+","+cipherKey[4]+","+cipherKey[5]+","+cipherKey[6]+","+cipherKey[7]+"}");
		
		
		//XOR Cipher Key with Cipher Text
		XOROperator xOperator = new XOROperator();
		decryptData = xOperator.xorBitsDecryption(cipherKey, cipherData);
		
		//Creating Bit Blocks
		ArrayList<Integer[]> bitBlocks = new ArrayList<Integer[]>();
		BitBlockCreator bitCreator = new BitBlockCreator();
		bitBlocks = bitCreator.createBitBlocks(decryptData);
		
		//Unshift bits
		ArrayList<Integer[]> unShiftedBitBlocks = new ArrayList<Integer[]>();
		Unshifter unshifter = new Unshifter();
		unShiftedBitBlocks = unshifter.unShiftBits(bitBlocks);
		
		//Create decryptedByteArray
		ByteArrayCreator byteCreator = new ByteArrayCreator();
		decryptData = byteCreator.createByteArray(unShiftedBitBlocks);
		
		
		
		
		
		
		return decryptData;
	}
}
