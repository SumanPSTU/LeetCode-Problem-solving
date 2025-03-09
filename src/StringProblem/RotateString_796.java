package StringProblem;

public class RotateString_796 {


    public boolean rotateString(String s, String goal) {
        char[] ch = goal.toCharArray();
        for (char c :ch){
            if (!s.contains(String.valueOf(c))) return false;
        }
        return true;
    }
}
