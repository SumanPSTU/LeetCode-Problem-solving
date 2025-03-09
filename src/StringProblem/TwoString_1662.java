package StringProblem;

public class TwoString_1662 {
    public static void main(String[] args) {
       String[] word1 = {"ab", "c","dd"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = String.join("",word1);
        String string = String.join("",word2);
        return s.equals(string);
    }
}
