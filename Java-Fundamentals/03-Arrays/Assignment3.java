import java.util.Scanner;
public class Assignment3 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n=input.nextInt();
        System.out.println("Enter Array Elements: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Enter element to search: ");
        int search=input.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println(i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println(-1);
        }
        
    }
}
