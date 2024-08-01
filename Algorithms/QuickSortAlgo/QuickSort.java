package QuickSortAlgo;

public class QuickSort {


    // Function to perform quicksort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Function to partition the array
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Choosing the pivot element
        int i = low - 1;  // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;  // Return the partitioning index
    }

    // Main function to test the algorithm
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, n - 1);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    // Function to print the array
    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
