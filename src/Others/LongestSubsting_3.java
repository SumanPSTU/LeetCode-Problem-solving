import java.util.Arrays;

public class LongestSubsting_3 {
    public static void main(String[] args) {
        String[] str ={"flower","flow","flight"};
        System.out.println(LongestSubString(str));
        System.out.println(usingSringBuilder(str));
    }
    static String LongestSubString(String[] str){
        Arrays.sort(str);
        int index = 0;
        while (index<str[0].length() && index<str[str.length-1].length()){
            if (str[0].charAt(index) == str[str.length-1].charAt(index)){
                index++;
            }else {
                break;
            }
        }
        return index==0?"None":str[0].substring(0,index);
    }
    static String usingSringBuilder(String[] str){
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(str);
        for (int i = 0; i < str[0].length(); i++) {
            if (str[0].charAt(i) == str[str.length-1].charAt(i)){
                stringBuilder.append(str[0].charAt(i));
            }else {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
