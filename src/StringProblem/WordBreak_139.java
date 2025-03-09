package StringProblem;

import java.util.List;

public class WordBreak_139 {


    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            StringBuilder sb  = new StringBuilder();
            for(String st :wordDict){
                sb.append(st);
            }
            if(s.contains(sb)) return true;
            return false;
        }
    }
}
