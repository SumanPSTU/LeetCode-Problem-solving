package StringProblem;

public class UniqueCharacterString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("etcodlovel"));
        System.out.println(firstUniqChar("ThisiT"));
        System.out.println(firstUniqChar("level"));
    }
    public static int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
         for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            for (int j = 1; j < ch.length; j++) {
                if (c==ch[j]){
                    return j-1;
                }
            }
        }
        return 0;
    }
}
