/*Create a thread which prints 1 to 10. After printing 5, there should be a delay of 
5000 milliseconds before printing 6*/




public class Assignment1 extends Thread{
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                if(i==6){
                    Thread.sleep(5000);
                }
                System.out.print(i+" ");

            }
        }
        catch(Exception e){
            System.out.println("Exception found");
        }
        
    }
    public static void main(String[] args){
        Assignment1 a=new Assignment1();
        a.start();

    }
}