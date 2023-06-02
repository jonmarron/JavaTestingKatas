package katas.Grasshopper;

public class Grasshopper {
    // Write a program that finds the sum of every number from 1 to num. The number will always be a positive integer greater than 0.
    public int calculateSum(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            count += i;
        }
        return count;
    }
}
