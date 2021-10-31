package com.example.customlib.crypto;

public class Encrypt {

    public String encryptString(String inputString){
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        return sb.toString();
    }

    public String decryptString(String inputString){
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        return sb.toString();
    }
}
