import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        boolean found6=false;
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=6 && i<arr.length-1 && found6==false){
                sum=sum+arr[i];

            }
            else{
                found6=true;
                if(arr[i]==7){
                    found6=false;
                }
                i++;

            }
            
        }

        
    }
}
