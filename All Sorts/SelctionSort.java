import java.util.Arrays;

public class SelctionSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                minIndex=j;
                }
            }

                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;

            }
        }
    


    public static void main(String[] args){
        int arr[]={26,38,92,56,18};
            System.out.println("Arrays Before Sorting:"+Arrays.toString(arr));
            selectionSort(arr);

            System.out.println("Arrays After Sorting:"+Arrays.toString(arr));



    }

    
}
