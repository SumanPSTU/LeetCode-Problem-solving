package Math;

public class RemoveDuplicate_27 {
    public static void main(String[] args) {
        int[] array = {3,2,2,3,2};
        System.out.println(removeElement(array,2));
    }
    public static int removeElement(int[] arr, int val){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=val){
                arr[count] = arr[i];
                count++;
            }
        }

        return count;
    }
}
