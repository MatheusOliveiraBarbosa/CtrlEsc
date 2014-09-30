/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.util.security;

import java.security.MessageDigest;

/**
 *
 * @author WitaloCarlos
 */
public class Encrypter {
    
    private static final char[] HEXADECIMAL = {'0', '1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    
    public static String md5HashPassword(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.reset();

        byte[] bytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder(2 * bytes.length);
        for (int i = 0; i < bytes.length; i++) {
            int low = (int)(bytes[i] & 0x0f);
            int high = (int)((bytes[i] & 0xf0) >> 4);
            sb.append(HEXADECIMAL[high]);
            sb.append(HEXADECIMAL[low]);
        }
        return sb.toString();
    }

    public static String sha256HashPassword(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.reset();

        byte[] bytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder(2 * bytes.length);
        for (int i = 0; i < bytes.length; i++) {
            int low = (int)(bytes[i] & 0x0f);
            int high = (int)((bytes[i] & 0xf0) >> 4);
            sb.append(HEXADECIMAL[high]);
            sb.append(HEXADECIMAL[low]);
        }
        return sb.toString();
    }
    
}
