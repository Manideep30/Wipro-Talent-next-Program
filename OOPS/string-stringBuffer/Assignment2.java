public class Assignment2 {
    public static void main(String [] args){
        String s1=args[0].toLowerCase();
        String s2=args[1].toLowerCase();
        String ans="";
        for(int i=0;i<s1.length();i++){
            ans=ans+s1.charAt(i);
        }
        
        
        if(s1.charAt(s1.length()-1)!=s2.charAt(0)){
            ans=ans+" ";
            for(int j=0;j<s2.length();j++){
                ans=ans+s2.charAt(j);
            
            }
        }
        else{
            
            for(int j=1;j<s2.length();j++){
                ans=ans+s2.charAt(j);
            }
        }
        System.out.println(ans);
        

        
    }
    
}
