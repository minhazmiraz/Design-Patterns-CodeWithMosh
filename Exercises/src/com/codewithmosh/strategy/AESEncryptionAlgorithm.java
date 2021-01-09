package com.codewithmosh.strategy;

public class AESEncryptionAlgorithm implements EncryptionAlgorithm{
    @Override
    public void Encrypt(String message) {
        System.out.println("Encrypting " + message + " using AES");
    }
}
