public class Assignment10 {
    public static void main(String[] args){
        String s1=args[0];
        int n=Integer.parseInt(args[1]);
        int from=s1.length()-n;
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=from;j<s1.length();j++){
                ans=ans+s1.charAt(j);
            }
        }
        System.out.println(ans);
    }
    
}
