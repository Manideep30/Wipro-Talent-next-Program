/*Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.
withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
without Ten ([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]*/

import java.util.*;
public class Assignment9 {
    public static void main(String [] args){
        try (Scanner input = new Scanner(System.in)) {
            int n=input.nextInt();
            int arr[]=new int[n];
            int ten=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                
            }
            for(int i:arr){
                if(i==10){
                    ten++;
                }
            }
            int ans[]=new int[n];
            int ele=0;
            int m=n-1;
            for(int i=0;i<n;i++){
                if(arr[i]!=10)
                    ans[ele++]=arr[i];
                else{
                    ans[m--]=0;
                    
                }
            }
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
        }
        

        
    }

    
}
