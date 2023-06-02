package katas.RemoveChars;

public class RemoveFirstAndLastChars {
    public String remove(String str) {
        return str.length() > 2 ? str.substring(1, str.length() - 1) : "no can do";
    }
}
