import java.util.Scanner;

public class Facto {
    public static void main(String[] args){
        int number;
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int answer = factorial(number);
        System.out.print("The factorial of " + number + " is " + answer);
    }

    static int factorial(int n){
        if(n == 1) 
            return 1;
        return n * factorial(n - 1);
    }
}
