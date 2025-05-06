package ArraysProblem;

public class ContainerWithMostWater_11 {

    //brute force approach (it's a solution but time limit exit)
    public static int maxAreaBruteForce(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int min;
                if (height[i] == height[j]) {
                    min = height[i];
                } else {
                    if (height[i] < height[j]) {
                        min = height[i];
                    } else {
                        min = height[j];
                    }
                }
                int max = min * (j - i);
                if (max > maxArea) {
                    maxArea = max;
                }
            }
        }
        return maxArea;

    }

    //two pointer approach
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int area = Math.min(height[left], height[right])*(right - left);

            if (area > maxArea) {
                maxArea = area;
            }
            //update pointer which control the area of water
            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] arr = {1, 1};
        System.out.println(maxArea(array));
        int max = maxArea(arr);
        System.out.println(max);
    }
}
