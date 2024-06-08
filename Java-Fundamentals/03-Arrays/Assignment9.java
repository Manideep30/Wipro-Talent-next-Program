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
