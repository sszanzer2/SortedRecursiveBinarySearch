package SS;

public class SortedRecursiveBinarySearch {
	
	    public static int recursiveBinarySearch(int[] arr, int target) {
	        return recursiveBinarySearch(arr, target, 0, arr.length - 1);
	    }

	    private static int recursiveBinarySearch(int[] arr, int target, int low, int high) {
	        if (low > high) {
	            // Base case: target is not in the array
	            return -1;
	        }

	        int mid = (low + high) / 2;

	        if (arr[mid] == target) {
	            // Base case: target found at index mid
	            return mid;
	        } else if (arr[mid] < target) {
	            // Search the right half of the array
	            return recursiveBinarySearch(arr, target, mid + 1, high);
	        } else {
	            // Search the left half of the array
	            return recursiveBinarySearch(arr, target, low, mid - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int target = 1;
	        int result = recursiveBinarySearch(arr, target);

	        if (result != -1) {
	            System.out.println("The number " + target + " was found at index " + result);
	        } else {
	            System.out.println("The number " + target + " was not found in the array.");
	        }
	    }
	}

