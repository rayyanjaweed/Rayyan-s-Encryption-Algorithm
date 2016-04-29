import java.io.IOException;


public class TestRun {

	public static void main(String[] args) {

		//Reading User Data
		byte[] inputData = "".getBytes();
		byte[] encryptedData = "".getBytes();
		InputMessageFileReader fr = new InputMessageFileReader();
		try {
			inputData = fr.readMessageFile(ConstantValues.inputFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("User data or message is read from the source file. Source file location = "+ConstantValues.inputFilePath);
		
		//Encrypt Message
		EncryptMessage encryptor = new EncryptMessage();
		System.out.println("Private Plain Key for Encryption= "+ConstantValues.KEY);
		encryptedData = encryptor.encryptUserMessage(inputData, ConstantValues.KEY);
		System.out.println("User data or message is now encrypted");
		
		//Writing Cipher to a file
		OutputMessageFileReader encryptedFileWriter = new OutputMessageFileReader();
		try {
			encryptedFileWriter.writeMessageFile(encryptedData, ConstantValues.writeFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Encrypted user data or message is now written to the destination file. Encrypted message file location = "+ConstantValues.writeFilePath);
		
		
		//Reading Cipher Data
		byte[] cipherData = "".getBytes();
		InputMessageFileReader cipherFR = new InputMessageFileReader();
		try {
			cipherData = cipherFR.readMessageFile(ConstantValues.cipherFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Encrypted user data or message is now read from the source file. Encrypted message file location = "+ConstantValues.cipherFilePath);
		
		
		//Decrypt Cipher Data
		byte[] decryptedData = "".getBytes();
		DecryptMessage decryptor = new DecryptMessage();
		System.out.println("Private Plain Key for Decryption= "+ConstantValues.KEY);
		decryptedData = decryptor.decryptCipherMessage(cipherData, ConstantValues.KEY);
		System.out.println("Encrypted message is now decrypted");
		
		
		//Writing Decrypted data to a file
		OutputMessageFileReader decryptedFileWriter = new OutputMessageFileReader();
		try {
			decryptedFileWriter.writeMessageFile(decryptedData, ConstantValues.writeDecryptedFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Decrypted message is now written to the destination file. Decrypted message file location = "+ConstantValues.writeDecryptedFilePath);
		
	}

}
