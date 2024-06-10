/*Write a program to print * in Floyds format (using for and while loop)
Example1)
C:\>java Sample
O/P: Please enter an integer number 3

*
* *
* * *

*/


public class Assignment12 {
    public static void main(String [] args){
        int n=Integer.parseInt(args[0]);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
