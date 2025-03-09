package StringProblem;

public class TruncuteSentance_1816 {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] string = s.split(" ");
        for (int i =0;i<k;i++){
            sb.append(string[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public String truncateSentenceOther(String s, int k) {
        char[] charArray = s.toCharArray();
        int count = 0;
        int index = s.length();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                count++;
                if (count == k) {
                    index = i;
                    break;
                }
            }
        }
        return s.substring(0, index);
    }
    
}
