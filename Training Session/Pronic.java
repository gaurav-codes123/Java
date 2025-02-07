public class Pronic {
    public static void main(String[] args) {
        int n = 12;
        int flag =0;
        for (int i=0;i<n/2;i++){
            if(i*(i+1)==n){
            flag=1;
            break;   
        }}
        if(flag==1){
            System.out.println("Pronic Number");
        }
        else{
            System.out.println("Not Pronic Number");

        }
}
}

