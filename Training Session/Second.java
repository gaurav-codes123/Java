public class Second {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int s_min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) {
                s_min=min;
                min=arr[i];
            }
            else if(arr[i]<s_min){
                s_min=arr[i];
            }
        }
    
System.out.println("Second Smallest Element is:"+s_min);
}