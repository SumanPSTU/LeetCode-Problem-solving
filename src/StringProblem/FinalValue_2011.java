package StringProblem;

public class FinalValue_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i =0;i<operations.length;i++){
            if(operations[i].equals("--x")|| operations[i].equals("x--")){
                x-=1;
            }
            if (operations[i].equals("++x") || operations[i].equals("x++")){
                x+=1;
            }
        }
        return x;
    }
}
