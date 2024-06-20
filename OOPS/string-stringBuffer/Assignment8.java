public class Assignment8 {
    public static void main(String[] args){
        String s1=args[0];
        int start=0;
        int end=0;
        int star=0;
        String ans="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='*'){
                start=i-1;
                end=i+1;
                star=i;
                break;
            }
        }
        for(int i=0;i<s1.length();i++){
            if(i==start || i==end || i==star){
                continue;
            }
            else{
                ans=ans+s1.charAt(i);
            }
        }
        System.out.println(ans);
    }
    
}
