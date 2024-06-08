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
