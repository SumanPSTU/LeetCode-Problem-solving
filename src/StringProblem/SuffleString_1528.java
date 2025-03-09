package StringProblem;

public class SuffleString_1528 {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,2,1,3};
        String str = "codeleet";
        System.out.println(new SuffleString_1528().restoreString(str,arr));
    }
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < indices.length-1; i++) {
            for (int j = 0; j < indices.length-1-i; j++) {
                if (indices[j]>indices[j+1]){
                    int temp  = indices[j];
                    char tChar = arr[j];
                    indices[j] = indices[j+1];
                    arr[j] = arr[j+1];
                    indices[j+1] = temp;
                    arr[j+1] = tChar;
                }
            }
        }
        return String.valueOf(arr);
    }
    public static String restoreStringOther(String s, int[] indices){
        char[] ans = new char[s.length()];
        for (int i = 0;i<s.length();i++){
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}
