package StringProblem;

public class SortThePeople_2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<names.length-1;i++){
            for (int j = 0;j<names.length-i-1;j++){
                if(heights[j]<heights[j+1]){
                    int temp = heights[j];
                    String tem = names[j];
                    heights[j] = heights[j+1];
                    names[j] = names[j+1];
                    heights[j+1] = temp;
                    names[j+1] = tem;
                }
            }
        }
        return names;
    }
}
