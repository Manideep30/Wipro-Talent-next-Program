/*Given an array of type int, print true if every element is 1 or 4.
only14([1, 4, 1, 4]) → true 
only14([1, 4, 2, 4]) false 
only14([1, 1]) → true*/

import java.util.*;
public class Assignment11 {
    public static boolean helper(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1 || arr[i]!=4){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        try (Scanner input = new Scanner(System.in)) {
            int n=input.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            System.out.println(helper(arr));
        }

    }
    
}
