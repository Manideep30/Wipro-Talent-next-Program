/*Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.
middleway([1, 2, 3], [4, 5,6])  -- [2,5] 
middleWay([7, 7, 7], [3, 8, 0]) -- [7, 8] 
middleWay([5, 2, 9], [1, 4, 5]) -- [2, 4]*/


import java.util.Scanner;
public class Assignment12 {
    public static void main(String [] args){
        try (Scanner input = new Scanner(System.in)) {
            int n=3;
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            int ans[]=new int[2];
            for(int i=0;i<arr1.length;i++){
                arr1[i]=input.nextInt();
            }
            for(int i=0;i<arr1.length;i++){
                arr2[i]=input.nextInt();
            }
            ans[0]=arr1[arr1.length/2];
            ans[1]=arr2[arr2.length/2];
            System.out.print(ans[0]+" "+ans[1]);
        }
        
    }
    
}
