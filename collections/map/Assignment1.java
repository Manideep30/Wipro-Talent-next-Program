/*1. Develop a java class with a instance variable M1 (HashMap) create a method
saveCountryCapital (String CountryName, String capital), the method should add the passed 
country and capital as key/value in the map M1 and return the Map (M1).
Key- Country
India
Japan
Value Capital
Delhi Tokyo
2. Develop a method getCapital (String CountryName) which returns the capital for the 
country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the 
capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with 
Capital as the key and value as Country and returns the Map M2.
Key - Capital
Delhi
Tokyo
Value Country
India
Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all 
the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.*/

import java.util.*;
import java.util.Map.Entry;
public class Assignment1 {
    static HashMap<String,String>hm=new HashMap<>();
    HashMap<String,String> saveCountryCapital(String countryName,String capital){
        hm.put(countryName,capital);
        return hm;
    }
    

    String getCapital(String countryName){
        if(hm.containsKey(countryName)){
            return hm.get(countryName);
        }
        return null;
    }
    String getCountryName(String capital){
        for(Entry<String,String>entry:hm.entrySet()){
            if(entry.getValue()==capital){
                return entry.getKey();
            }   
        }
        return null;
    }

    static HashMap<String,String>hm2=new HashMap<>();

    HashMap<String,String> swapCapitalCountry(HashMap<String,String> hm,HashMap<String,String>hm2){
        for(Entry<String,String>entry:hm.entrySet()){
            hm2.put(entry.getValue(),entry.getKey());
        }
        return hm2;
    }
    static ArrayList<String>arr=new ArrayList<>();

    ArrayList<String> getName(HashMap<String,String>hm,ArrayList<String>arr){
        for(Entry<String,String>entry:hm.entrySet()){
            arr.add(entry.getKey());
        }
        return arr;

    }
    
    public static void main(String[] args) {
        Assignment1 a=new Assignment1();
        a.saveCountryCapital("India", "Delhi");
        a.saveCountryCapital("Japan", "Tokyo");
        a.saveCountryCapital(null, null);

        System.out.println(a.getCapital("India"));
        System.out.println(a.getCapital("America"));
        a.swapCapitalCountry(hm, hm2);
        for(Entry<String,String>entry:hm2.entrySet()){
            System.out.print(entry.getKey()+" : "+entry.getValue());
            System.out.println();
        }
        System.out.println();
        a.getName(hm,arr);
        for(String i:arr){
            System.out.println(i);
        }



        
    }
    
}
