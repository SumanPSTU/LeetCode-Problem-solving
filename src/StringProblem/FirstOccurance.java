package StringProblem;

public class FirstOccurance {
    public static void main(String[] args) {
        String str = " string";
        String sub ="is";
        System.out.println(strStr(str,sub));;
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
