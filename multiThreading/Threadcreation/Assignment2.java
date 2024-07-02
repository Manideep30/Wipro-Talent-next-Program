/*store colours in the form of an array
ex: String colours[]={"white","blue","black", "green", "red", "yellow"}; display all 
colours repeatedly by generating colour index from Random class. 
If the random colour index matches to red stop display.Note: perform this task by 
implementing Runnabe interface*/

import java.util.*;
public class Assignment2 implements Runnable{
    public void run(){
        String arr[]={"white","blue","black", "green", "red", "yellow"};
        Random r=new Random();
        int randomIdx=r.nextInt(arr.length);
        while(!arr[randomIdx].equals("red")){            
            System.out.println(arr[randomIdx]);
            randomIdx=r.nextInt(arr.length);

        }

    }
    public static void main(String[] args){
        Assignment2 a=new Assignment2();
        Thread t1=new Thread(a);
        t1.start();

    }
    
}
