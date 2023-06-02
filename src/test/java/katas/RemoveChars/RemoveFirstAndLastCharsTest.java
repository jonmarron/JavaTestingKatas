package katas.RemoveChars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstAndLastCharsTest {
    RemoveFirstAndLastChars removeFirstAndLastChars = new RemoveFirstAndLastChars();

    @Test
    void removeFrom5LetterWord() {
        String wordToEdit = "lorem";

        String actual = removeFirstAndLastChars.remove(wordToEdit);
        String expected = "ore";

        assertEquals(expected, actual);
    }

    @Test
    void removeFrom2LetterWord(){
        String wordToEdit = "et";

        String actual = removeFirstAndLastChars.remove(wordToEdit);
        String expected = "no can do";

        assertEquals(expected, actual);
    }
}