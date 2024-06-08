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
