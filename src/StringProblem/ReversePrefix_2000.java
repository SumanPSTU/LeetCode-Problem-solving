package StringProblem;

public class ReversePrefix_2000 {
    public static void main(String[] args){
       String word = "xyxzxe";
        char ch = 'z';
        System.out.println(word.substring(0,word.indexOf(ch)+1));
        System.out.println(reversePrefix(word,ch));
    }
    public static String reversePrefix(String word, char ch) {
        if (word.indexOf(ch)>=0){
            char[] sub = word.substring(0,word.indexOf(ch)+1).toCharArray();
            for (int i = 0;i<sub.length/2;i++){
                char temp = sub[i];
                sub[i] = sub[sub.length-i-1];
                sub[sub.length-i-1] = temp;
            }
            return String.valueOf(sub)+word.substring(word.indexOf(ch)+1);
        }
        return word;
    }
}
