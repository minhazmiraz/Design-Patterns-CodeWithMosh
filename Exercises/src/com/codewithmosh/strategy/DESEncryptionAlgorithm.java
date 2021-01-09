package com.codewithmosh.strategy;

public class DESEncryptionAlgorithm implements EncryptionAlgorithm{
    @Override
    public void Encrypt(String message) {
        System.out.println("Encrypting " + message + " using DES");
    }
}
