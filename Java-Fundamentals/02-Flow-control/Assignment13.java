/*Write a program to reverse a given number and print
Example1)
I/P: 1234
0/P:4321

Example2) I/P: 1004
O/P: 4001*/


public class Assignment13 {
    public static void main(String [] args){
        int n=Integer.parseInt(args[0]);
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
            
        }
        int ans=sum;
        System.out.println(ans);
    }
    
}
