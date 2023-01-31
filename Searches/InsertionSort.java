package Searches;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {4,5,6,7,8,9,3,1,2};

        InsertionSort(array);

        for(int i: array){
            System.out.print(i + " ");

        }
    }

    private static void InsertionSort (int[] array) {
        for(int i=1; i<array.length; i++){
            int temp = array[i];
            int j = i-1;

            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
                
            }
            array[j+1] = temp;
        }
    }
}