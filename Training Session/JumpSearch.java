public class JumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length; 
        int step = (int) Math.floor(Math.sqrt(n)); 
        int prev = 0; // Variable to track the start of the block

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step; 
            step += (int) Math.floor(Math.sqrt(n)); 
            if (prev >= n) 
                return -1;
        }
        while (arr[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) 
                return -1;
        }

        if (arr[prev] == target)
            return prev; 

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Sorted array
        int target = 80; // Element to search for

        int result = jumpSearch(arr, target);

        if (result == -1)
            System.out.println("Element " + target + " not found in the array.");
        else
            System.out.println("Element " + target + " found at index " + result);
    }
}





    
    

