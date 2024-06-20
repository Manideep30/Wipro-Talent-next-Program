//Write a program to check whether a given String is Palindrome or not
import java.util.Scanner;
public class Assignment1{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int i=0;
        int j=s.length()-1;
        boolean flag=true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("Given "+s+" is not Palindrome");
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("Given "+s+" is Palindrome");
        }
    }
}