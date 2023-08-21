package katas.ConsonantValue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConsonantValueTest {
    String invalid = "aeiou";
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    ConsonantValue consonantValue = new ConsonantValue(invalid, alphabet);
    @ParameterizedTest
    @CsvSource({
            "zodiac, 26",
            "chruschtschov, 80",
            "khrushchev, 38",
            "strength, 57",
            "catchphrase, 73",
            "twelfthstreet, 103",
            "mischtschenkoana, 80",
            "codiaz, 26"
    })
    void solve(String word, int expected) {

        int actual = consonantValue.solve(word);

        assertEquals(expected, actual);
    }
}