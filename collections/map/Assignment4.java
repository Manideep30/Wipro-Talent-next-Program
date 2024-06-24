/*Create a Collection "Contactlist" using HashMap to store name and phone number of contacts 
added. The program should use appropriate generics (String, Integer) and have the following 
abilities: a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

import java.util.HashMap;
import java.util.Map.Entry;
public class Assignment4 {
    static HashMap<String,Integer>contactlist=new HashMap<>();

    boolean keyExists(String key){
        if(contactlist.containsKey(key)){
            return true;
        }
        return false;

    }

    boolean valueExists(int value){
        if(contactlist.containsValue(value)){
            return true;
        }
        return false;

    }

    void iterating(HashMap<String,Integer>hm){
        for(Entry<String,Integer>entry:hm.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        Assignment4 a4=new Assignment4();
        contactlist.put("police",100);
        contactlist.put("ambulance",108);
        contactlist.put("fireStation",101);
        System.out.println(a4.keyExists("police"));
        System.out.println(a4.valueExists(103));
        a4.iterating(contactlist);
        

        

    }
    
}
