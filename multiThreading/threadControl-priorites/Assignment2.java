/*Create two threads, one thread to display all even numbers between 1 & 20, 
another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers Hint: use join*/

public class Assignment2 extends Thread {
    public void run(){
        if(Thread.currentThread().getName().equals("Thread-0")){
            for(int i=1;i<=20;i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        else if(Thread.currentThread().getName().equals("Thread-1")){
            for(int i=1;i<=20;i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        Assignment2 t1=new Assignment2();
        Assignment2 t2=new Assignment2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();

    }
    
}
