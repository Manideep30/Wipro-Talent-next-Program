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
