package katas.ValidParentheses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();


    @ParameterizedTest
    @CsvSource({
            "(), true",
            "'', true",
            "(())((())), true",
            ")())()(()(, false",
            "((())), true",
            "()()(), true",
            "(()())(), true",
            "()(())((()))(())(), true",
            ")(, false",
            "()()(, false",
            "((()), false",
            "())((), false",
            ")(), false",
            "), false",
            "()))((, false"
    })
    void parenthesesIsValid(String string, boolean expected) {
        boolean result = validParentheses.parenthesesIsValid(string);
        assertEquals(expected, result);
    }
}
