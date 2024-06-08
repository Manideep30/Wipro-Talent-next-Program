public class Assignment14 {
    public static void main(String [] args){
        int arr[][]=new int[3][3];
        int k=0;
        if(args.length<9){
            System.out.println("Please enter 9 values");
            return;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=Integer.parseInt(args[k++]);
                
            }
        }
        System.out.println("The given Array is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
        int maxe=arr[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]>maxe){
                    maxe=arr[i][j];
                }
            }
        }
        System.out.println("The biggest number in the given array is "+maxe);
    }
    
}
