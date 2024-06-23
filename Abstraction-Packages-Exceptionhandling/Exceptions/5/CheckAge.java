public class CheckAge {
    public static void main(String[] args) throws AgeException {
        try{
            String name=args[0];
            int age=Integer.parseInt(args[1]);
            if(args.length!=2){
                throw new ArrayIndexOutOfBoundsException();
            }
            if(age<18 || age>59){
                throw new AgeException();
            }
            else{
                System.out.println("User is between 18 and 59 (inclusive)");
            }
        }
        catch(AgeException e){

        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception occured");
        }
        
    }
    
    
    
}
