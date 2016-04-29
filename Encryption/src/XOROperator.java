
public class XOROperator {

	public byte[] xorBitsEncryption(byte[] cipherKey, byte[] cipherText){
		int numbOfChar = cipherText.length;
		byte[] encryptedBits = new byte[numbOfChar];
		for(int i=0; i < 8;i++){
			for(int k=0; k < numbOfChar;k++){
				encryptedBits[k] = (byte) (cipherText[k] ^ cipherKey[i]);
				cipherText[k] = encryptedBits[k];
			}
		}
		return encryptedBits;
	}
	
	public byte[] xorBitsDecryption(byte[] cipherKey, byte[] cipherText){
		int numbOfChar = cipherText.length;
		byte[] decryptedBits = new byte[numbOfChar];
		for(int i=7; i >= 0; i--){
			for(int k=0; k < numbOfChar;k++){
				decryptedBits[k] = (byte) (cipherText[k] ^ cipherKey[i]);
				cipherText[k] = decryptedBits[k];
			}
		}
		return decryptedBits;
	}
}
