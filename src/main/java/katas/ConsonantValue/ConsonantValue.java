package katas.ConsonantValue;

import java.util.ArrayList;
import java.util.List;

public class ConsonantValue {

    private final String invalid;
    private final String possibleValues;
    private List<Integer> values;


    public ConsonantValue(String invalid, String possibleValues) {
        this.invalid = invalid;
        this.possibleValues = possibleValues;
        values = new ArrayList<>();
    }

    public int solve(String word) {
        char[] characters = word.toCharArray();
        char prevChar = 'a';
        int valueAcc = 0;
        int index = 0;

        for (char character : characters) {
            if (!isValid(character)) {
                values.add(valueAcc);
                valueAcc = 0;
            } else if (isValid(prevChar)) {
                valueAcc += getValueOfChar(character);
                if (isLastElement(index, characters)) {
                    values.add(valueAcc);
                }
            } else {
                valueAcc = getValueOfChar(character);
                if (isLastElement(index, characters)) {
                    values.add(valueAcc);
                }
            }
            prevChar = character;
            index++;
        }

        return values.stream()
                .mapToInt(value -> value)
                .max()
                .orElse(0);
    }

    private boolean isLastElement(int index, char[] characters) {
        return index == characters.length - 1;
    }

    private int getValueOfChar(char character) {
        char[] possibleValues = this.possibleValues.toCharArray();
        for (int i = 0; i < possibleValues.length; i++) {
            if (character == possibleValues[i]) {
                return i + 1;
            }
        }
        throw new IllegalArgumentException("not a valid element");
    }

    private boolean isValid(char character) {
        return !invalid.contains(Character.toString(character));
    }
}
