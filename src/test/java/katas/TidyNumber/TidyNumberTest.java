package katas.TidyNumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TidyNumberTest {
    TidyNumber tidyNumber = new TidyNumber();

    @ParameterizedTest
    @CsvSource({
            "0, true",
            "01,true",
            "10, false",
            "12, true",
            "32, false",
            "39, true",
            "1024, false",
            "12576, false",
            "13579, true",
            "2335, true"
    })
    void isTheNumberTidy(int number, boolean expected) {
        boolean result = tidyNumber.isTheNumberTidy(number);
        assertEquals(expected, result);
    }
}