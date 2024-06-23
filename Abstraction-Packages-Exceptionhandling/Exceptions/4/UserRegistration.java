public class UserRegistration{
    static void registerUser(String userName,String userCountry) throws InvalidCountryException{
        try{
            if(!userCountry.equals("India")){
                throw new InvalidCountryException();
            }
            else{
                System.out.println("User Registration successful");
            }
        }
        catch(InvalidCountryException e){

        }
        catch(Exception e){
            System.out.println("Exception found");
        }

    }
    public static void main(String[] args) throws InvalidCountryException {
        String userName=args[0];
        String userCoutry=args[1];
        registerUser(userName, userCoutry);
        
    }
    
}
