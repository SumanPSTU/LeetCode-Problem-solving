package StringProblem;

import java.util.Arrays;

public class LastWordLen {
    public static void main(String[] args) {
        String string = "Hello world!";
        String[] words = string.split(" ");
        String s = words[words.length - 1];
        int len = s.length();
        System.out.println(s);
        System.out.println(len);
    }
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
