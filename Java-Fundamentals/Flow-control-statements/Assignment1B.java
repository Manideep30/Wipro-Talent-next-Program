public class Assignment1B {
    public static boolean lastDigit(int a,int b){
        int one=a%10;
        int two=b%10;
        if(one!=two)
            return false;
        return true;
    }
    public static void main(String [] args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        boolean ans=lastDigit(a,b);
        System.out.println(ans);
    }
    
}
