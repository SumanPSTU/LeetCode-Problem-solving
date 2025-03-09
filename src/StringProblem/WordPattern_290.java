package StringProblem;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {



    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hash = new HashMap<Character,String>();
        String[] string = s.split(" ");
        if (s.length() != string.length) return false;
        for (int i = 0; i<string.length;i++){
            char c  = pattern.charAt(i);
            boolean contains = hash.containsKey(c);
            if (!contains && !hash.get(c).equals(string[i])){
                hash.put(c,string[i]);
            }else {
                if (contains && !hash.get(c).equals(string[i])) return false;
                if (!contains ) {
                    hash.put(c,string[i]);
                }
            }
        }
        return true;
    }
}
