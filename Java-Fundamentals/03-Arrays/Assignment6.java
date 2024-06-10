/*Write a program to initialize an array and print them in a sorted order.*/


import java.util.Scanner;
public class Assignment6{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}