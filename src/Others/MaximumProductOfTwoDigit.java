package Others;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaximumProductOfTwoDigit {

    public static int maxProduct(int n) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (n>0){
            int r = n%10;
            list.add(r);
            n/=10;
        }

        int l = 0;
        int r = list.size()-1;
        while (l<r){
            int t = list.get(l)*list.get(r);
            if (t>ans){
                ans = t;
            }
            if (list.get(l)>list.get(r)){
                r--;
            }else {
                l++;
            }

        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(maxProduct(124));
    }

}
