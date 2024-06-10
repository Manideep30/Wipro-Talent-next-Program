/*Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.
evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd ([3, 3, 2]) → [2, 3, 3]
evenOdd ([2, 2, 2]) → [2, 2, 2]*/



import java.util.Scanner;
public class Assignment10 {
    public static void main(String [] args){
        try (Scanner input = new Scanner(System.in)) {
            int n=input.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int ans[]=new int[n];
            int even=0;
            int odd=-1;
            for(int i=0;i<n;i++){
                if(arr[i]%2!=0){
                    odd++;
                }

            }
            for(int i=0;i<n;i++){
                if(arr[i]%2==0){
                    ans[even++]=arr[i];
                }
                else{
                    ans[odd++]=arr[i];
                }
            }
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
        }


    }
    
}
