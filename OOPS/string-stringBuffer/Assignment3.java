public class Assignment3 {
    public static void main(String [] args){
        String s1=args[0];
        int len=s1.length();
        String ans="";  // Wipro
        for(int i=0;i<len;i++){
            for(int j=0;j<2;j++){
                ans=ans+s1.charAt(j);
            }
        }
        System.out.println(ans);
    }
    
}
