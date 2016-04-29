import java.util.ArrayList;


public class EncryptMessage {
	public byte[] encryptUserMessage(byte[] data, String privateKey){
		
		//Creating Bit Blocks
		ArrayList<Integer[]> bitBlocks = new ArrayList<Integer[]>();
		BitBlockCreator bitCreator = new BitBlockCreator();
		bitBlocks = bitCreator.createBitBlocks(data);
		
		//Shifting Bits
		ArrayList<Integer[]> shiftedBitBlocks = new ArrayList<Integer[]>();
		Shifter bitShifter = new Shifter();
		shiftedBitBlocks = bitShifter.shiftBits(bitBlocks);
		
		
		//Create cipherByteArray
		byte[] cipherText = {};
		ByteArrayCreator byteCreator = new ByteArrayCreator();
		cipherText = byteCreator.createByteArray(shiftedBitBlocks);
		
		//Create a private key
		byte[] cipherKey = new byte[8];
		KeyCreator kCreator = new KeyCreator();
		cipherKey = kCreator.generateCipherKeyEncryption(privateKey);
		System.out.println("Modified cipher key for encryption = {"+cipherKey[0]+","+cipherKey[1]+","+cipherKey[2]+","+cipherKey[3]+","+cipherKey[4]+","+cipherKey[5]+","+cipherKey[6]+","+cipherKey[7]+"}");
		
		//XOR Cipher Key with Cipher Text
		XOROperator xOperator = new XOROperator();
		cipherText = xOperator.xorBitsEncryption(cipherKey, cipherText);
		
		
		return cipherText;
	}
}
