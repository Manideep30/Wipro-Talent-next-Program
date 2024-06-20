public class Assignment9 {
    public static void main(String[] args){
        String s1=args[0];
        String s2=args[1];
        String ans="";
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            ans=ans+s1.charAt(i);
            ans=ans+s2.charAt(j);
            i++;
            j++;
        }
        while(i<s1.length()){
            ans=ans+s1.charAt(i);
            i++;
        }
        while(j<s2.length()){
            ans=ans+s2.charAt(j);
            j++;
        }
        System.out.println(ans);


    }
    
}
