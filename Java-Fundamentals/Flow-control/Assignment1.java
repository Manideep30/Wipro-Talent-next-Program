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


