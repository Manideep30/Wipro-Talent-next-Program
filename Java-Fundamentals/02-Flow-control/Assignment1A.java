

/*1A) Write a program to check if a given integer number is Positive, Negative, or Zero.*/


public class Assignment1A {
    public static void main(String [] args){
        int n=Integer.parseInt(args[0]);
        if(n==0)
            System.out.println("Zero");
        else if(n>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
    
}
