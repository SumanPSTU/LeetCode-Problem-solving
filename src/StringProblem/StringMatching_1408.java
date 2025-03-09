package StringProblem;
import java.util.*;
public class StringMatching_1408 {


    public List<String> stringMatching(String[] words) {
        List<String> list = new LinkedList<>();
        for(int i = 0 ; i< words.length-1;i++){
            for(int j = i + 1;j<words.length;j++){
                if(words[i].indexOf(words[j])>=0){
                    if (!list.contains(words[j])){
                        list.add(words[j]);
                    }
                }
            }
        }

        return list;
    }
}
