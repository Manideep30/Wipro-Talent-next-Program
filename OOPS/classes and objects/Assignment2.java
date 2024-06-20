public class Assignment2 {
    public static void main(String [] args){
        Calculator c=new Calculator();
        System.out.println("Power of two integer numbers: "+c.powerInt(2,5));
        System.out.println("power of two Double numbers: "+c.powerDouble(2.0, 3.0));


    }
    
}
class Calculator{
    static int powerInt(int num1,int num2){
        return (int)(Math.pow(num1,num2));

    }
    static double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }

}
