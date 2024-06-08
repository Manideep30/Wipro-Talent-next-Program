import java.util.Scanner;
public class Assignment7 {
    public static void sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Enter array size: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.print("Eneter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        sort(arr);
        int ans[]=new int[n];
        int k=0;
        ans[k++]=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                ans[k++]=arr[i];
            }

        }
        for(int i=0;i<k;i++){
            System.out.print(ans[i]+" ");
        }
        

    }
    
}
