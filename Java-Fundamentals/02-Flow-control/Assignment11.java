/*Write a program to print the sum of all the digits of a given number.
Example1) I/P:1234
0/P:10 */



public class Assignment11 {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int sum=0;
        int rem;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
