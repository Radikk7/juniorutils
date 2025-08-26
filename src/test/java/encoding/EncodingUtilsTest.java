package encoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EncodingUtilsTest {

    @Test
    void base64_roundtrip() {
        String s = "Hello, world!";
        String enc = EncodingUtils.encodeBase64(s);
        assertEquals(s, EncodingUtils.decodeBase64(enc));
    }

    @Test
    void url_roundtrip() {
        String s = "Hello world? q=тест & x=1";
        String enc = EncodingUtils.encodeURL(s);
        assertEquals(s, EncodingUtils.decodeURL(enc));
    }

    @Test
    void hex_roundtrip_utf8() {
        String s = "Привет 🙂";
        String hex = EncodingUtils.encodeHex(s);
        String back = EncodingUtils.decodeHex(hex);
        assertEquals(s, back);
    }

    @Test
    void rot13_and_caesar() {
        assertEquals("Uryyb", EncodingUtils.applyROT13("Hello")); // ROT13 детерминированный
        String c = EncodingUtils.encodeCaesar("Hello", 5);
        assertEquals("Hello", EncodingUtils.decodeCaesar(c, 5));
    }

    @Test
    void hashes_md5_sha256() {
        assertEquals("5d41402abc4b2a76b9719d911017c592", EncodingUtils.hashMD5("hello"));
        assertEquals("2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824",
                EncodingUtils.hashSHA256("hello"));
    }


    @Test
    void null_inputs() {
        assertNull(EncodingUtils.encodeBase64(null));
        assertNull(EncodingUtils.decodeBase64(null));
        assertNull(EncodingUtils.encodeURL(null));
        assertNull(EncodingUtils.decodeURL(null));
        assertNull(EncodingUtils.encodeHex(null));
        assertNull(EncodingUtils.decodeHex(null));
        assertNull(EncodingUtils.applyROT13(null));
        assertNull(EncodingUtils.encodeCaesar(null, 5));
        assertNull(EncodingUtils.hashMD5(null));
        assertNull(EncodingUtils.hashSHA256(null));
    }
    @Test
    void url_roundtrip_with_plus_percent() {
        String s = "a+b%20c";
        String enc = EncodingUtils.encodeURL(s);
        assertEquals(s, EncodingUtils.decodeURL(enc));
    }

}
