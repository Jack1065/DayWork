package Searches;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,2,5,6,8,34,667,23,56};
        int index = linearSearch(array,1);
        if(index != -1){
            System.out.println("element found at index " + index);
        }
        else{
            System.out.println("element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
