/*Create two threads and assign names 'Scooby' and 'Shaggy' to the two threads. 
Display both thread names.*/


public class Assignment1 extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String[] args){
        Thread t1=new Thread("Sccoby");
        Thread t2=new Thread("Shaggy");

        System.out.println(t1.getName());
        System.out.println(t2.getName());


    }
}