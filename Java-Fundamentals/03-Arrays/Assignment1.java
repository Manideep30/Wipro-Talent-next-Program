/*Write a program to initialize an integer array and print the sum and average of the array.*/

import java.util.Scanner;
public class Assignment1{
    public static void main(String [] args){
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}