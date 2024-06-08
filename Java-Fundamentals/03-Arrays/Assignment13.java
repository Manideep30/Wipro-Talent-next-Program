public class Assignment13 {
    public static void main(String[] args){
        
        if(args.length<4){
            System.out.println("Please enter four numbers");
        }
        else{
            int k=0;
            System.out.println("The given Array is: ");
            int arr[][]=new int[2][2];
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]=Integer.parseInt(args[k]);
                    k++;

                }
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }
            System.out.println("The reverse of Array is: ");
            for(int i=1;i>=0;i--){
                for(int j=1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }
            
        }
        

    }
    
}
