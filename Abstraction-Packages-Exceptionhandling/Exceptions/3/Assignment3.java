import java.util.Scanner;
public class Assignment3{
    public static void main(String[] args) throws NegativeValueException,IndexOutOfBound {
        Scanner input=new Scanner(System.in);
        try{
            int sum=0;
            for(int i=0;i<2;i++){
                
                int maths=0;
                int phy=0;
                int chem=0;

                System.out.print("\nStudent "+(i+1)+" name : ");
                String studentName=input.nextLine();
                System.out.print("Maths marks : ");

                if(input.hasNextInt()){
                    maths=input.nextInt();
                    if(maths<0){
                        throw new NegativeValueException();
                    }
                    if(maths>100){
                        throw new IndexOutOfBound();
                    }
                }
                else{
                    throw new NumberFormatException();
                }
                input.nextLine();
                System.out.print("physics marks : ");
                

                if(input.hasNextInt()){
                    phy=input.nextInt();
                    if(phy<0){
                        throw new NegativeValueException();
                    }
                    if(phy>100){
                        throw new IndexOutOfBound();
                    }
                }
                else{
                    throw new NumberFormatException();
                }
                input.nextLine();
                System.out.print("chemistry marks : ");
                if(input.hasNextInt()){
                    chem=input.nextInt();
                    if(chem<0){
                        throw new NegativeValueException();
                    }
                    if(chem>100){
                        throw new IndexOutOfBound();
                    }
                }
                else{
                    throw new NumberFormatException();
                }
                System.out.println(studentName+" 'marks");
                System.out.print("Maths :"+maths);
                System.out.print(" physics :"+phy);
                System.out.println(" chemistry :"+chem);
                System.out.println("Average marks of "+studentName+" is : "+(maths+phy+chem)/3);

            }
            
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        catch(IndexOutOfBound e){

        }
        catch(NegativeValueException e){

        }
        
        
    }
}