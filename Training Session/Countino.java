import java.util.Scanner;

public class Countino {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        int len=str.length();
        String rev="";
        String org_str=str;


        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev)){
        System.out.println(rev+" is Palindrome");
        }else{
            System.out.println(rev+" is  Not Palindrome");
        }
    }
}    

