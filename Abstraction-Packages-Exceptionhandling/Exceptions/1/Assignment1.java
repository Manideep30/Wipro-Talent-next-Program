import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=Integer.parseInt(args[0]);
        int arr[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println();
        try{
            int idx=Integer.parseInt(args[1]);
            System.out.println(arr[idx]);
        }
        catch(NumberFormatException e){
            System.out.println("NFE");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("AIOE");
        }
        catch(Exception e){
            System.out.println("Other Exception found");
        }
    }
    
}
