package katas.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public int [] solve (int [] array){
        List<Integer> uniqueValues = new ArrayList<>();
        for(int num : array) {
            if(!uniqueValues.contains(num)) {
                uniqueValues.add(num);
            }
        }
        int[] uniqueArray = new int[uniqueValues.size()];
        int index = 0;
        for(int num : uniqueValues){
            uniqueArray[index] = num;
            index++;
        }
        return uniqueArray;
    }
}
