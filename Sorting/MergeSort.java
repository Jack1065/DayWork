package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,5,6,7,9,1};

        mergeSort(array);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");

    }
}
    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length<=1)return;

        int mid = length/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];
        int i = 0;
        int j = 0;

        for(;i<length;i++){
            if(i<mid){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
        }
    }
    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray,rightArray,array);
}

    private static void merge(int [] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length-leftSize;
        int i = 0, l = 0, r = 0; //indices
        //check conditions for merging
        while(l<leftSize && r<rightSize){
            if(leftArray[l]<rightArray[r]){
              array[i] = leftArray[l];
              i++;
              l++;
            }
            else{
              array[i] = rightArray[r];
              i++;
              r++;
        }
    }
    while(l<leftSize){
        array[i] = leftArray[l];
        i++;
        l++;
    }
    while(r<rightSize){
        array[i] = rightArray[r];
        i++;
        r++;

        }
    }
}
