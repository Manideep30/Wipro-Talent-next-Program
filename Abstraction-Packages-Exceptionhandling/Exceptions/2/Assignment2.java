import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String [] args){
        int sum=0;
        double avg=0;
        Scanner input=new Scanner(System.in);
        int size=Integer.parseInt(args[0]);
        int arr[]=new int[size];

        try{
            String s[]=input.nextLine().split(" ");
            if(s.length!=size){
                throw new InputMismatchException();
            }
            
            for(int i=0;i<size;i++){
                arr[i]=input.nextInt();
                sum=sum+arr[i];
            }
            
                
            avg=sum/size;
            System.out.println("Sum is: "+sum);
            System.out.println("Average is: "+avg);
        }
        catch(InputMismatchException e){
            System.out.println("IMME");
        }
        catch(NumberFormatException e){
            System.out.println("NFE");
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        catch(Exception e){
            System.out.println("Other exception found");
        }
    }
    
}
