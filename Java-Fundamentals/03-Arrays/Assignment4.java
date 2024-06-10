/*Initialize an integer array with ascii values and print the corresponding character values in a single row.*/


import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print((char)(arr[i])+" ");
        }

    }
    
}
