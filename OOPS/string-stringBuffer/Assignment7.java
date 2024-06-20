public class Assignment7 {
    public static void main(String[] args){
        String s1=args[0];
        String ans="";
        if(s1.charAt(0)=='x' && s1.charAt(s1.length()-1)=='x'){
            for(int i=1;i<s1.length()-1;i++){
                ans=ans+s1.charAt(i);
            }
            System.out.println(ans);
        }
        else{
            System.out.println(s1);
        }
    }
    
}
