package ArraysProblem;

public class ContainerWithMostWater_11 {

    //brute force approach
    public static int maxArea(int[] height) {
        int maxArea = 1;
        int minHeight = 0;
        for (int i=0;i<height.length-1;i++){
            for (int j = i+1; j <height.length ; j++) {
                if (height[i]>height[j]){

                }
            }
        }
        return maxArea;

    }
    public static void main(String[] args){
        int[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(array));
    }
}
