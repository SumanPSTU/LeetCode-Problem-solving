package StringProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindWord_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new LinkedList<>();
        for(int i =0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                list.add(i);
            }
        }
        return list;
    }
    public List<Integer> findWordsContainingOther(String[] words, char x){
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (String word:words){
            if (word.indexOf(x)>=0){
                list.add(index++);
            }
        }
        return list;
    }

}
