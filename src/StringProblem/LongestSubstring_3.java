package StringProblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestSubstring_3 {
    public static void main(String[] args) {
        LongestSubstring_3 l = new LongestSubstring_3();
        System.out.println(l.lengthOfLongestSubstring("abcdabcbb"));
        System.out.println(l.OtherLongestSubstring("abcdabcbb"));
        System.out.println(l.OtherLongestSubstring("abcdabcdeabcdefg"));
    }
    public  int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        List<Character> list = new ArrayList<>();
        while (end<s.length()){
            if (!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength,list.size());
            }else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxLength;
    }
    // try using HashSet class

    public int OtherLongestSubstring(String s){
        int start = 0;
        int end = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while (end<s.length()){
            if (!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                max = Math.max(max,set.size());
            }else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
