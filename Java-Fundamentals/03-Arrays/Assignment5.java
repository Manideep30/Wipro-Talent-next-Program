import java.util.Scanner;
public class Assignment5{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        int secMax=Integer.MIN_VALUE;
        int min=arr[0];
        int secMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[0];
                
            }
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }
        }
        System.out.println("Maximun two numbers: "+(max)+" "+(secMax));
        System.out.println("Maximun two numbers: "+(min)+" "+(secMin));
    }
}