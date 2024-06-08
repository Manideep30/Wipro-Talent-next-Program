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
