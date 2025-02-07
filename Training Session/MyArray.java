public class MyArray{
    public static void main(String[] args) {
        int arr[] = {10, 4, 7, 3, 5, 2};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest No is:" + min);
        System.out.println("Largest No is:" + max);
    }
}