//write a program to accept string from user and print all palindrome words from the string and also print the word with second highest length in the given string
import java.util.Scanner;  // Import the Scanner class
public class PdSecond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

    }
}
