import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args) {
        int arr[]={26,38,92,56,18};
        int n=arr.length;
        System.out.println("Arrays Before Sorting:"+Arrays.toString(arr));



        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
        }
    }
}
        System.out.println("Array After Sorting: " + Arrays.toString(arr));
    }
}
