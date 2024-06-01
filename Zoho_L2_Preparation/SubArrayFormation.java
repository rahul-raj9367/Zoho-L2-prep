/*
2)Two arrays will be given. One array will be larger in size than the other array. Write a program to convert the second array into sub-array of the larger array by rearranging the array elements of the second array. Refer example.
Note: Sub-arrays formed should be continuous in the first array.
Example 1:
Enter the size of big array: 10
Enter the size of small array: 3
Enter the elements of the big array: 2, 5, 3, 8, 9, 1, 0, 5, 8, 3
Enter the elements of the small array: 3, 8,5
Sub-arrays formed after matching:
*/
import java.util.Arrays;
class SubArrayFormation {
	public static void main(String[] args) {
		int[] bigArray = {2, 5, 8, 9, 3, 1, 0, 5, 8, 3};
        
        int[] smallArray = {3, 8, 5};
        boolean found=false;
        int bigArraySize=bigArray.length;
        int smallArraySize=smallArray.length;

        Arrays.sort(smallArray);//3 5 8

        for(int i=0;i<=bigArraySize-smallArraySize;i++){
        	int subArray[]=Arrays.copyOfRange(bigArray,i,i+smallArraySize);
        	Arrays.sort(subArray);

        	if(Arrays.equals(subArray,smallArray)){
        		System.out.println("From Index "+i+ " to "+ (i+smallArraySize-1)+" : "+Arrays.toString(Arrays.copyOfRange(bigArray,i,i+smallArraySize)) );
        		found=true;
        	}
        }

        if(!found){
        	System.out.println("No matching sub-array formed.");
        }

	}



















	// public static void main(String[] args) {
    //     // Input elements of big array
    //     int[] bigArray = {2, 5, 8, 9, 3, 1, 0, 5, 8, 3};
        
    //     // Input elements of small array
    //     int[] smallArray = {3, 8, 5};

    //     int smallSize = smallArray.length;
    //     int bigSize = bigArray.length;
        
    //     // Sort the small array
    //     int[] sortedSmallArray = new int[smallSize];
    //     for (int i = 0; i < smallSize; i++) {
    //         sortedSmallArray[i] = smallArray[i];
    //     }
    //     sortArray(sortedSmallArray);//3 5 8 
        
    //     boolean found = false;
        
    //     // Check for all possible sub-arrays of bigArray
    //     for (int i = 0; i <= bigSize - smallSize; i++) {//10-3=7
    //         int[] subArray = new int[smallSize];
    //         for (int j = 0; j < smallSize; j++) {
    //             subArray[j] = bigArray[i + j];
    //         }
    //         sortArray(subArray);
            
    //         if (arraysEqual(sortedSmallArray, subArray)) {
    //             System.out.println("Sub-array found from Index " + i + " to " + (i + smallSize - 1) + ": " + Arrays.toString(Arrays.copyOfRange(bigArray, i, i + smallSize)));
    //             found = true;
    //         }
    //     }
        
    //     if (!found) {
    //         System.out.println("No matching sub-array formed.");
    //     }
    // }
    
    // // Method to sort an array using basic bubble sort
    // private static void sortArray(int[] array) {
    //     int n = array.length;
    //     for (int i = 0; i < n-1; i++) {
    //         for (int j = 0; j < n-i-1; j++) {
    //             if (array[j] > array[j+1]) {
    //                 // Swap array[j] and array[j+1]
    //                 int temp = array[j];
    //                 array[j] = array[j+1];
    //                 array[j+1] = temp;
    //             }
    //         }
    //     }
    // }
    
    // // Method to check if two arrays are equal
    // private static boolean arraysEqual(int[] arr1, int[] arr2) {
    //     if (arr1.length != arr2.length) return false;
    //     for (int i = 0; i < arr1.length; i++) {
    //         if (arr1[i] != arr2[i]) return false;
    //     }
    //     return true;
    // }
}
/*
From Index 7 to 9 : [5, 8, 3]
*/