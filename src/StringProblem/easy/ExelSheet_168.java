package StringProblem.easy;

public class ExelSheet_168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
       while (columnNumber>0){
           int r = (columnNumber-1)%26;
           sb.append((char) (r+'A'));
           columnNumber = (columnNumber-1)/26;
       }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new ExelSheet_168().convertToTitle(28));
    }
}
