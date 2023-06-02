package katas.EnoughPlaceOnTheBus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnoughPlaceTest {
    EnoughPlace enoughPlace = new EnoughPlace();
    @Test
    void fifteenCantGetOn() {
        int capacity = 20;
        int onTheBus = 15;
        int waiting = 20;
        int expected = 15;

        int actual = enoughPlace.enoughPlace(capacity, onTheBus, waiting);

        assertEquals(expected, actual);
    }

    @Test
    void everyoneGetsOn(){
        int capacity = 20;
        int onTheBus = 5;
        int waiting = 15;
        int expected = 0;

        int actual = enoughPlace.enoughPlace(capacity, onTheBus, waiting);

        assertEquals(expected, actual);
    }
}