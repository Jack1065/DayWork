package Searches;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
       int array[] = new int[100000000];
       int target= 23434554;
       for(int i=0; i<array.length; i++){
           array[i]=i;
       }
      
       //int index = Arrays.binarySearch(array, target);
       int index = binarySearch(array, target);

       if(index == -1){
        System.out.println("Target not found");
       }
       else{
        System.out.println("element found at : "+index);
       }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = array[mid];
            System.out.println("middle: " + value);

            if (value < target)
                low = mid + 1;
            else if (value > target)
                high = mid - 1;
            else {
                return mid;
            }

        }
        

            


        return -1;
    }
}

