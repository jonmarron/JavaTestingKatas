package katas.WillYouMakeIt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroFuelTest {
    ZeroFuel testEnoughFuel = new ZeroFuel();
    @Test
    void wontMakeIt() {
        // Arrange
        double distanceToPump = 200;
        double kpl = 20;
        double fuelLeft = 5;
        // Act
        boolean enoughFuel = testEnoughFuel.ZeroFuel(distanceToPump, kpl, fuelLeft);
        // Assert
        assertFalse(enoughFuel);
    }
    @Test
    void willJustMakeIt(){
        // Arrange
        double distanceToPump = 1000;
        double kpl = 20;
        double fuelLeft = 50;
        // Act
        boolean enoughFuel = testEnoughFuel.ZeroFuel(distanceToPump, kpl, fuelLeft);
        // Assert
        assertTrue(enoughFuel);
    }
    @Test
    void willEasilyMakeIt(){
        // Arrange
        double distanceToPump = 20;
        double kpl = 20;
        double fuelLeft = 20;
        // Act
        boolean enoughFuel = testEnoughFuel.ZeroFuel(distanceToPump, kpl, fuelLeft);
        // Assert
        assertTrue(enoughFuel);
    }
}