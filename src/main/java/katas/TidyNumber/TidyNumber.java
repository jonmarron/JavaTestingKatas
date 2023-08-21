package katas.TidyNumber;

public class TidyNumber {

    public boolean isTheNumberTidy(int number){
        String numStr = Integer.toString(number);
        int prevDigit = 0;
        for (char digit : numStr.toCharArray()){
            int numberToCheck = Character.getNumericValue(digit);
            if (numberToCheck < prevDigit){
                return false;
            }
            prevDigit = numberToCheck;
        }
        return true;
    }
}
