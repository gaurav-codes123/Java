import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String1:");
        String s1=sc.next();
        System.out.print("Enter String2:");
        String s2=sc.next();

        if(areAnagram(s1,s2)){
            System.out.println("The Strings are anagram");

        }else{
            System.out.println("The Strings are not anagram");

        }

    }

    public static boolean areAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    
}
