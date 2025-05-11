package Contest;

import java.util.HashMap;

public class SumOfMaxFrequency {
    public boolean vowelCheck(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int helperVowel(HashMap<Character,Integer> map){
        int max = 0;
        for (char c:map.keySet()){
            if (vowelCheck(c) && map.get(c)>max){
                max = map.get(c);
            }
        }
        return max;
    }
    public int helperConst(HashMap<Character,Integer> map){
        int max = 0;
        for (char c:map.keySet()){
            if (!vowelCheck(c) && map.get(c)>max){
                max = map.get(c);
            }
        }
        return max;

    }
    public int maxFreqSum(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i =0;i<s.length();i++){
                if (!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),1);
                }else {
                    int a = map.get(s.charAt(i));
                    map.remove(s.charAt(i));
                    map.put(s.charAt(i),a+1);
                }
            }
        return helperConst(map)+helperVowel(map);
    }
    public static void main(String[] args){
        String s = "successes";
        System.out.println(new SumOfMaxFrequency().maxFreqSum(s));
    }
}
