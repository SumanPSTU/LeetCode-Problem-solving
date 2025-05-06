package StringProblem.easy;

public class ReverseVowelsOfAString_345 {
    public boolean isVowel(char c){
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] chars = s.toCharArray();
        while (left<right){
            if (!isVowel(chars[left])){
                left++;
            }
            if (!isVowel(chars[right])){
                right--;
            }
            if (isVowel(chars[left]) && isVowel(chars[right])){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;

            }
        }
        return String.valueOf(chars);
    }
    public static void main(String[] args){
        String s = "IceCreAm";
        System.out.println(new ReverseVowelsOfAString_345().reverseVowels(s));
    }
}
