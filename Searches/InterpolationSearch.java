package Searches;
public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8,9};

        int index = InterpolationSearch(array,5);
        if (index !=-1){
            System.out.println("element found at index: " + index);
        }
        else{
            System.out.println("element not found");
        }
    }

    private static int InterpolationSearch(int[] array, int value) {
        int high= array.length-1;
        int low= 0;
        while (value>= array[low] && value<=array[high] && low<=high){
            int probe = (high-low) * (value-array[low]) / (array[high]);
            System.out.println("Probe: " + probe);
    if(array[probe]==value){
        return probe;
        }
        else if(array[probe]<value){
            low=probe+1;
        }
        else{
            high =probe-1;
        }
    }
        

        return -1;
    }
}

