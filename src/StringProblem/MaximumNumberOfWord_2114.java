package StringProblem;

public class MaximumNumberOfWord_2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s:sentences){
            String[] str = s.split(" ");
            if (str.length>max){
                max = str.length;
            }
        }
        return max;
    }
    public int mostWordsFoundOther(String[] sentences){
        int max = 0;
        for (String word:sentences){
           int count = 1;
           for (int i = 0;i<word.length();i++){
               if (word.charAt(i)==' '){
                   count++;
               }
           }
           if (count>max) max = count;
       }
       return max;
    }
    public int mostWordsFoundDifferent(String[] sentences){
        int max = 0;
        for (String s:sentences){
            if (wordCheck(s)>max) max = wordCheck(s);
        }
        return max;
    }
    private static int wordCheck(String string){
        int count = 1;
        for (int i = 0;i<string.length();i++){
            if (string.charAt(i)==' ') count++;
        }
        return count;
    }
}
