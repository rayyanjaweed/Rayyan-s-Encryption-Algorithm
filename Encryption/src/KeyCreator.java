
public class KeyCreator {

	public byte[] generateCipherKeyEncryption(String privateKey){
		byte[] cipherKeyBytes = new byte[8];
		byte[] privateKeyBytes = privateKey.getBytes();
		cipherKeyBytes[0] = privateKeyBytes[0];
		for(int i=1; i < 8; i++){
			cipherKeyBytes[i] = (byte) (cipherKeyBytes[i-1] ^ privateKeyBytes[i]); 
		}
		return cipherKeyBytes;
	}
	
	public byte[] generateCipherKeyDecryption(String privateKey){
		byte[] cipherKeyBytes = new byte[8];
		byte[] privateKeyBytes = privateKey.getBytes();
		cipherKeyBytes[0] = privateKeyBytes[0];
		for(int i=1; i < 8; i++){
			cipherKeyBytes[i] = (byte) (cipherKeyBytes[i-1] ^ privateKeyBytes[i]); 
		}
		return cipherKeyBytes;
	}
}
