package katas.RemoveSpaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSpacesTest {
    RemoveSpaces removeSpaces = new RemoveSpaces();

    @Test
    void removes4Spaces() {
        //Arrange
        String stringToEdit = "Lorem ipsum sit dolor amet";
        //Act
        String actual = removeSpaces.removeSpaces(stringToEdit);
        String expected = "Loremipsumsitdoloramet";
        //Assert
        assertEquals(expected, actual);
    }
}