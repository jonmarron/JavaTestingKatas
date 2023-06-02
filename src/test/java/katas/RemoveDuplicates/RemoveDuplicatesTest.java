package katas.RemoveDuplicates;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    @ParameterizedTest
    @MethodSource("arraysProvider")
    void removeDuplicates(int[] expectedArray, int[] arrayToEdit){
        int[] result = removeDuplicates.solve(arrayToEdit);
        assertArrayEquals(expectedArray, result);
    }

    private static Stream<Arguments> arraysProvider(){
        return Stream.of(
                Arguments.of(new int[]{3,4,6}, new int[]{3,4,4,3,6,3}),
                Arguments.of(new int[]{6,4,3,8,1,2,9,7}, new int[]{6,4,3,8,6,1,2,3,9,7,8,7}),
                Arguments.of(new int[]{3,2,6,5,8,9,7,1,0,4}, new int[]{3,2,3,6,5,8,9,7,2,1,5,2,6,3,2,0,2,5,6,3,4,9,2,3,8}),
                Arguments.of(new int[]{1,2,3}, new int[]{1,2,1,1,1,2,1,2,3})
        );
    }
}