package co.anteia.utils

import java.security.SecureRandom
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class KeyGenerator {
    fun generateKey(length: Int): String {
        val rnJesus = SecureRandom();
        val chars = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz")
        val stringBuilder = StringBuilder();
        for (i in 0..length) {
            val rand = rnJesus.nextInt(chars.length - 1)
            stringBuilder.append(chars[rand]);
        }

        return stringBuilder.toString();
    }

    fun generateOTP(length: Int): String {
        val rnJesus = SecureRandom();
        val chars = ("0123456789")
        val stringBuilder = StringBuilder();
        for (i in 0..length) {
            val rand = rnJesus.nextInt(chars.length - 1)
            stringBuilder.append(chars[rand]);
        }

        return stringBuilder.toString();
    }
}