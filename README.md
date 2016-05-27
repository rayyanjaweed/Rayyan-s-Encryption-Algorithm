# Rayyan-s-Encryption-Algorithm


##### Features of the algorithm

1. It is a private key algorithm. Hence only the sender of the message and the receiver will have the key.
2. It is a symmetric key algorithm hence the key required while encrypting the message and the key required while decrypting the cipher text will both be the same.
3. It performs bitwise left circular shift bitwise XOR operations in different stages of encryption.
4. The length of the user message to be encrypted can be as long as possible. (Until memory restricts)
5. The user message can contain any alphabets, numbers and symbols possible.
-The private key can contain any alphabets, numbers and symbols possible.
6. 8 rounds of XOR operations is performed in total.

##### Limitations of the algorithm

There is just one limitation of this algorithm which is that the Private Key needs to be of just 8 characters.

##### Steps in Encryption

There are 5 steps

1. ###### Creating bit blocks
The user message received from the file is in the format of an array of bytes. The encryption procedure performs left circular shift and in order to do that, the user message bytes (array of byte) is converted into blocks of bits.

2. ###### Shifting bits ( Left circular shift)
Every byte in the user message represents a certain character. The binary value of the character undergoes a left circular shift. The first character of the user message undergoes a left circular shift by 2 bits. The second character of the user message undergoes a left circular shift by 4 bits. The third character of the user message undergoes a left circular shift by 6 bits. The fourth one goes through 2 bits, fifth one by 4 bits and so on until the end of all characters in the user message.

3. ###### Conversion of bit blocks to an array of byte
Once the bits are shifted, the bit blocks are converted back to the array of bytes.

4. ###### Creation of cipher key from a private key
Creation of the cipher key is done by performing XOR on the bits on the private key itself.
  1. The first character of the private key is the same as the first character of the cipher key.
  2. The second character of the cipher key is obtained by performing XOR of the first character of the cipher key with the second character of the private key.
  3. The above procedure is repeated to obtain the remaining characters of the cipher key.

5. ###### XOR(cipher key, bytes of shiftedbits)
This step is done in 8 rounds.
In the first round the whole bytes of the shifted bits are XORed with the first character of the cipher key. In the second round the whole bytes obtained from the previous round are XORed with the second charcter of the cipher key. And so on the procedure is repeated for 8 rounds.

##### Step to run the project:

1. Import existing project in eclipse
2. Open ConstantValues. java file.
3. Edit the values as follows
4. inputFilePath: URL of source file.
5. writeFilePath: URL of destination file for encrypted message.
6. cipherFilePath: URL of source file.
7. writeDecryptedFilePath:URL of destination for decrypted message.
8. Key: provide private key with (8 characters only)
9. Run ‘Test Run’ as a java application.
