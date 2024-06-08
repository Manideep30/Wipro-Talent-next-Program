public class Assignment2 {
    public static void main(String [] args){
        char s=args[0].charAt(0);
        if(Character.isDigit(s)){
            System.out.println("Digit");
        }
        else if(Character.isLetter(s)){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Special character");
        }
    }
    
}
