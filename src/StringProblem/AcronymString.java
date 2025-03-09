package StringProblem;
import java.util.ArrayList;
import java.util.List;
public class AcronymString {
    public boolean isAcronym(List<String> words, String s) {
        for (int i = 0;i<words.size();i++){
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("alice");
        list.add("bob");
        list.add("char");
        System.out.println(new AcronymString().isAcronym(list,"abc"));
    }
}
