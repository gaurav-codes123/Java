import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int []arr) {
        int temp,j;
        for(int i=1;i<arr.length;i++){
            temp=a[i];
            j=i;
            while(j<0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;

            }
            a[j]=temp;
        }
         System.out.println("Arrays Before Sorting:"+Arrays.toString(arr));
            insertionSort(arr);

            System.out.println("Arrays After Sorting:"+Arrays.toString(arr));
        
    }
    
}
