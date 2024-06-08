public class Assignment14 {
    public static int reverse(int n){
        int rem=0;
        int sum=0;
        while (n!=0) {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
            
        }
        return sum;
    }
    public static void main(String [] args){
        int n=Integer.parseInt(args[0]);
        int rev=reverse(n);
        if(rev==n){
            System.out.println(n+" is Palindrome");
        }
        else{
            System.out.println(n+" is not palindrome");
        }

    }
    
}
