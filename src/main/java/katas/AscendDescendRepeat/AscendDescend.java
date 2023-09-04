package katas.AscendDescendRepeat;

import java.util.ArrayList;
import java.util.List;

public class AscendDescend {

    public String solve(int length, int min, int max) {
        if (length == 0 || max < min) return "";
        List<Integer> result = new ArrayList<>();
        int current = min;
        boolean ascending = true;
        for (int i = 0; i < length; i++) {
            result.add(current);
            if (current == min) ascending = true;
            if (current == max) ascending = false;
            if (ascending) {
                current++;
            } else {
                current--;
            }
        }
        List<String> stringifiedResult = result.subList(0, result.size()).stream()
                .map(Object::toString)
                .toList();
        String truncatedResult = String.join("", stringifiedResult);
        if (truncatedResult.length() > length) {
            return truncatedResult.substring(0, length);
        }
        return truncatedResult;
    }
}
