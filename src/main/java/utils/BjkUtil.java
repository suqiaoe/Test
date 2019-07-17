package utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkUtil {
    private final static String CHARSET = "utf-8";
    public static String encryptBase64(String seed, String content) {
        try {
            byte[] rawKey = getRawKey(seed.getBytes(CHARSET));
            byte[] result = encrypt(rawKey, content.getBytes(CHARSET));
            return Base64.encodeBase64String(result);
        } catch (Exception e) {
           // LOGGER.error("AES加密base64编码出错", e);
            throw new RuntimeException(e);
        }
    }

    public static String decryptBase64(String seed, String encrypted) {
        try {
            byte[] rawKey = getRawKey(seed.getBytes(CHARSET));
            byte[] enc = Base64.decodeBase64(encrypted);
            byte[] result = decrypt(rawKey, enc);
            return new String(result, CHARSET);
        } catch (Exception e) {
           // LOGGER.error("AES解密base64出错", e);
            throw new RuntimeException(e);
        }
    }

    private static byte[] getRawKey(byte[] seed) throws NoSuchAlgorithmException {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        sr.setSeed(seed);
        kgen.init(128, sr); // 192 and 256 bits may not be available
        SecretKey skey = kgen.generateKey();
        byte[] raw = skey.getEncoded();
        return raw;
    }

    private static byte[] encrypt(byte[] raw, byte[] clear) throws NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES"); // AES/CBC/PKCS5Padding
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(clear);
        return encrypted;
    }

    private static byte[] decrypt(byte[] raw, byte[] encrypted) throws NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES"); // AES/CBC/PKCS5Padding
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] decrypted = cipher.doFinal(encrypted);
        return decrypted;
    }
}
