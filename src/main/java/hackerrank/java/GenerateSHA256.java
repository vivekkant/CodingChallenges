package hackerrank.java;

import java.security.MessageDigest;
import java.util.Scanner;

public class GenerateSHA256 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String message = in.next();
        byte[] bytesOfMessage = message.getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] thedigest = md.digest(bytesOfMessage);
        
        System.out.println(toHexString(thedigest));
    }
    
    public static String toHexString(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
