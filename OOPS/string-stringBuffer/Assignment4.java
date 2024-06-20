public class Assignment4 {
    public static void main(String [] args){
        String s1=args[0];
        String ans="";
        if(s1.length()%2!=0){
            System.out.println("null");
        }
        else{
            int len=s1.length()/2;
            for(int i=0;i<len;i++){
                ans=ans+s1.charAt(i);
            }
            System.out.println(ans);
        }
        
    }
    
}
