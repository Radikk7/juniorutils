package encoding;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HexFormat;

public class EncodingUtils {

    // Base64
    public static String encodeBase64(String input) {
        if (input == null) return null;
        return Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String decodeBase64(String encoded) {
        if (encoded == null) return null;
        byte[] decoded = Base64.getDecoder().decode(encoded);
        return new String(decoded, StandardCharsets.UTF_8);
    }

    // URL
    public static String encodeURL(String input) {
        if (input == null) return null;
        return URLEncoder.encode(input, StandardCharsets.UTF_8);
    }

    public static String decodeURL(String encoded) {
        if (encoded == null) return null;
        return URLDecoder.decode(encoded, StandardCharsets.UTF_8);
    }

    // HEX (UTF-8)
    public static String encodeHex(String input) {
        if (input == null) return null;
        byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
        return HexFormat.of().formatHex(bytes); // всегда 2 символа на байт
    }

    public static String decodeHex(String hexStr) {
        if (hexStr == null) return null;
        if ((hexStr.length() & 1) != 0) {
            throw new IllegalArgumentException("HEX string length must be even");
        }
        byte[] bytes = HexFormat.of().parseHex(hexStr);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    // ROT13
    public static String applyROT13(String input) {
        if (input == null) return null;
        StringBuilder out = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') out.append((char) ('a' + (c - 'a' + 13) % 26));
            else if (c >= 'A' && c <= 'Z') out.append((char) ('A' + (c - 'A' + 13) % 26));
            else out.append(c);
        }
        return out.toString();
    }

    // Caesar
    public static String encodeCaesar(String input, int shift) {
        if (input == null) return null;
        StringBuilder out = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                out.append((char) ((c - base + (shift % 26) + 26) % 26 + base));
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static String decodeCaesar(String input, int shift) {
        return encodeCaesar(input, 26 - (shift % 26));
    }

    // Hashes
    public static String hashMD5(String input) {
        return hashString(input, "MD5");
    }

     public static String hashSHA256(String input) {
    return hashString(input, "SHA-256");
    }

    private static String hashString(String input, String alg) {
        if (input == null) return null;
        try {
            MessageDigest md = MessageDigest.getInstance(alg);
            byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(hash); // ровно 2 hex-символа на байт
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }





}
