package katas.Grasshopper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {
    Grasshopper grasshopper = new Grasshopper();
    @Test
    void calculateSumUntilFive() {
        // Arrange
        int limit = 5;
        int expected = 1+2+3+4+5;
        // Act
        int actual = grasshopper.calculateSum(limit);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void calculateSumUntil10(){
        // Arrange
        int limit = 10;
        int expected = 1+2+3+4+5+6+7+8+9+10;
        // Act
        int actual = grasshopper.calculateSum(limit);
        // Assert
        assertEquals(expected, actual);
    }
}