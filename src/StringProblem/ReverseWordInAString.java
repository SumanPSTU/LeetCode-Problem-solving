package StringProblem;

public class ReverseWordInAString {
    public static void main(String[] args){
        ReverseWordInAString r = new ReverseWordInAString();
        System.out.println(r.reverseWords("a good   example"));
        String st = "a good   example";
        System.out.println(st.substring(1,8).trim());
    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sp = s.split("\\s+");
        int len = sp.length-1;
        while (len>-1){
            sb.append(sp[len]).append(" ");
            len--;
        }
        return sb.toString().trim();
    }
}
