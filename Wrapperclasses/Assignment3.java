import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s="";
        StringBuilder sb=new StringBuilder();
        // 15-- >1111

        while(n!=0){
            int rem=n%2;
            sb.append(String.valueOf(rem));
            n=n/2;
        }
        int inc=8-sb.length();
        while(inc>0){
            sb.append("0");
            inc--;
        }
        System.out.println(sb.reverse().toString());

    }
    
}
