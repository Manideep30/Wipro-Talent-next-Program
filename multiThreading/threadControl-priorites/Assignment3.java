/*Create three threads with different priorities same time MAX, MIN, NORM- and start the 
threadsat the same time. Observe the completion of the threads. */

public class Assignment3 extends Thread {
    public void run(){
        System.out.println("Now running on :"+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        Assignment3 t1=new Assignment3();
        Assignment3 t2=new Assignment3();
        Assignment3 t3=new Assignment3();

        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        

    }
    
}
