import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }
    
    public static void sort(int[] array) {
        // Inspect the array starting from index 0
        int length = array.length;
        int smallestNum = Main.smallest(array);
        int indexOfTheSmallest = Main.indexOfTheSmallest(array);
        Main.swap(array, 0, indexOfTheSmallest);
        int indexOfTheSmallestStartingFrom;
        for(int i = 1; i < length - 1; i++) {
            // Swap the value in index 0 with the smallest num
            indexOfTheSmallestStartingFrom = Main.indexOfTheSmallestStartingFrom(array, i);
            Main.swap(array, indexOfTheSmallestStartingFrom, i);
            System.out.println(Arrays.toString(array));
        } 
    }
    
    public static int smallest(int[] array) {
        int smallest = -1;
        int length = array.length;
        if(length != 0) {
            smallest = array[0];
            for(int i = 0; i < length; i++) {
                // Check if current number is smaller
                if(array[i] < smallest) {
                    smallest = array[i];
                }
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int indexOfTheSmallest = -1;
        int smallest = -1;
        int length = array.length;
        if(length != 0) {
            indexOfTheSmallest = 0;
            smallest = array[0];
            for(int i = 0; i < length; i++) {
                // Check if the current number is smaller
                if(array[i] < smallest) {
                    smallest = array[i];
                    indexOfTheSmallest = i;
                }
            }
        }
        return indexOfTheSmallest;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfTheSmallestStartingFrom = -1;
        int smallest = -1;
        int length = array.length;
        if(length != 0) {
            indexOfTheSmallestStartingFrom = index;
            smallest = array[index];
            for(int i = index; i < length; i++) {
                // Check if the current number is smaller
                if(array[i] < smallest) {
                    smallest = array[i];
                    indexOfTheSmallestStartingFrom = i;
                }
            }
        }
        return indexOfTheSmallestStartingFrom;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }   
}
