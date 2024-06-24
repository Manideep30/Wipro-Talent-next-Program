/*Write a program that will have a Properties class object which is capable of storing 
some States of India and their Capital. Use an Iterator to list all the elements stored 
in the Properties.*/

import java.util.*;
public class Assignment3 {
    
    public static void main(String[] args) {
        Properties p=new Properties();
        p.setProperty("Telanagana","Hyderabad");
        p.setProperty("AndraPradesh", "Amaravathi");
        p.setProperty("Tamilnadu", "Chennai");

        Set set=p.entrySet();
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
