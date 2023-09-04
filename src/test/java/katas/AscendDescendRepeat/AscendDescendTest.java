package katas.AscendDescendRepeat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AscendDescendTest {
    AscendDescend ascendDescend = new AscendDescend();
    @ParameterizedTest
    @CsvSource({
            "12321,5,1,3",
            "01210121012101,14,0,2",
            "56789876567,11,5,9",
            "'',0,1,2",
            "-5-4-3-2-3-,11,-5,-2",
            "'',15,2,1"
    })
    void solve(String expected, int length, int min, int max) {
        String result = ascendDescend.solve(length, min, max);
        assertEquals(expected, result);
    }
}