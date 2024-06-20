public class Assignment5 {
    public static void main(String[] args){
        String s1=args[0];
        String ans="";
        for(int i=1;i<s1.length()-1;i++){
            ans=ans+s1.charAt(i);

        }
        System.out.println(ans);
    }
    
}
