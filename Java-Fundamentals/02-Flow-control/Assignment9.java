/*Write a program to check if a given number is prime or not.*/

public class Assignment9 {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        int n=Integer.parseInt(args[0]);
        if(isPrime(n)){
            System.out.println(n+" is a Prime");
        }
        else{
            System.out.println(n+" is not a prime");
        }
    }
    
}
