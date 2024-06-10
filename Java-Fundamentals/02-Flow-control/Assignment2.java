/*Initialize a character variable in a program and
print 'Alphabhet' if the initialized value is an alphabhet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the initialized value is anything else.*/

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
