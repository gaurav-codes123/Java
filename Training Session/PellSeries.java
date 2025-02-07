public class PellSeries {
    public static void main(String[] args) {
    int n=15;
    int num1=0;
    int num2=1;
    int temp;

    System.out.print(num1+" "+num2+ " ");
    for(int i=0;i<n;i++){
        temp=(num2*2)+num1;
        num1=num2;
        num2=temp;
        System.out.print(temp+" ");
    }
}
}