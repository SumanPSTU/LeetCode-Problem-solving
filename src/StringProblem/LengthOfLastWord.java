package StringProblem;

public class LengthOfLastWord {


    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
        System.out.println(l.lengthOfLastWord("   fly me   to   the mo on  "));
    }
    public int lengthOfLastWord(String s) {
        String[] string = s.split(" ");
        return string[string.length-1].toCharArray().length;
    }
}
