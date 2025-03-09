package StringProblem;
public class StringCompression_443 {
    public static void main(String[] args){
        char[] chars = {'a','a','a','a','b','b','b','b','c','c','d'};
        StringCompression_443 s = new StringCompression_443();
        System.out.println(s.compress(chars));
    }
    public int compress(char[] chars){
        int index = 0;
        int i = 0;
        while (i<chars.length){
            char currentChar = chars[i];
            int count = 0;
            while (i<chars.length && currentChar == chars[i]){
                count++;
                i++;
            }
            chars[index++] = currentChar;
            if (count>1){
                for (char c : String.valueOf(count).toCharArray()){
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}