/*Initialize two character variables in a program and display the characters in alphabetical order. 
Example1) if the first character is 's' and second character is 'e' then the output should be e,s
Example2) if the first character is 'a' and second character is 'e', then the output should be a,e*/


public class Assignment1 {
    public static void main(String [] args){
		char s1=args[0].charAt(0);
		char s2=args[1].charAt(0);
		int a1=s1-97;
		int b1=s2-97;
		if(a1>b1){
		    System.out.print(s1+","+s2);
		}
		else{
		    System.out.print(s2+","+s1);
		}
	}
}


