package com.codewithmosh.strategy;

public class ChatClient {
    /*private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }*/

    public void send(String message, EncryptionAlgorithm encryptionAlgorithm) {
        if (encryptionAlgorithm == null)
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        else
            encryptionAlgorithm.Encrypt(message);

        System.out.println("Sending the encrypted message...");
    }
}
