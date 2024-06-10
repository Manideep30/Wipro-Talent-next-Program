/*Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
Eg1) Array Elements {10,3,6,1,2,7,9}
O/P: 22
[i.e 10+3+9]
Eg2) Array Elements O/P:19 {7,1,2,3,6}
Eg3) Array Elements 0/P:10 {1,6,4,7,9}
*/

import java.util.Scanner;
public class Assignment8 {

    public static int sum(int[] arr){
        int tot=0;
        for(int i:arr){
            tot=tot+i;

        }
        return tot;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int sixidx=0;
        int sevenidx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                sixidx=i;
            }
            if(arr[i]==7){
                sevenidx=i;
            }
        }
        if(sevenidx<sixidx){
            int ans=sum(arr);
            System.out.println(ans);
        }
        else{
            int sume=0;
            for(int i=0;i<arr.length;i++){
                if(i>=sixidx && i<=sevenidx){
                    continue;
                }
                else{
                    sume=sume+arr[i];
                }
            }
            System.out.println(sume);

        }

        
        

        
    }
}
