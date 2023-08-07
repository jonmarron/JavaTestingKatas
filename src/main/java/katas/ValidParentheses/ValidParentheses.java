package katas.ValidParentheses;

public class ValidParentheses {
    public boolean parenthesesIsValid(String parentheses){

        while (parentheses.contains("()")){
            parentheses = parentheses.replace("()", "");
        }

        return parentheses.equals("");
    }
}
