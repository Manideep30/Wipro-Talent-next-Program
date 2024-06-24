/*Create a Collection called HashMap which is capable of storing String objects. 
The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not. 
c) Use Iterator to loop through the map.*/


import java.util.*;
import java.util.Map.Entry;
public class Assignment2 {
    
    static HashMap<Integer,String>hm=new HashMap();

    boolean keyExists(int key){
        return hm.containsKey(key);
    }
    boolean valueExists(String value){
        return hm.containsValue(value);
    }

    void iteration(HashMap<Integer,String>hm){
        for(Entry<Integer,String>entry:hm.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());  
        }
    }
    
    public static void main(String[] args) {
        hm.put(0,"Manideep");
        hm.put(1,"Rajesh");
        hm.put(2,"Ravi");

        Assignment2 a2=new Assignment2();
        boolean a=a2.keyExists(0);
        boolean b=a2.valueExists("kiran");
        System.out.println(a);
        System.out.println(b);
        a2.iteration(hm);




        
    }

    
    
}
