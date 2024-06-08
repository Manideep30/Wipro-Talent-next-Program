public class Assignment4 {
    public static void main(String [] args){
        char ch=args[0].charAt(0);
		if(Character.isLowerCase(ch)){
		    System.out.println(Character.toUpperCase(ch));
		}
		else{
		    System.out.println(Character.toLowerCase(ch));
		}
		
	}
    
    
}
