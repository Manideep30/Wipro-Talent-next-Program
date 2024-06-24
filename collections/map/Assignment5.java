/*Implement the assignment 1 using TreeMap*/


import java.util.*;
import java.util.Map.Entry;
public class Assignment5 {
    static TreeMap<String,String>hm=new TreeMap<>();
    TreeMap<String,String> saveCountryCapital(String countryName,String capital){
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

    static TreeMap<String,String>hm2=new TreeMap<>();

    TreeMap<String,String> swapCapitalCountry(TreeMap<String,String> hm,TreeMap<String,String>hm2){
        for(Entry<String,String>entry:hm.entrySet()){
            hm2.put(entry.getValue(),entry.getKey());
        }
        return hm2;
    }
    static ArrayList<String>arr=new ArrayList<>();

    ArrayList<String> getName(TreeMap<String,String>hm,ArrayList<String>arr){
        for(Entry<String,String>entry:hm.entrySet()){
            arr.add(entry.getKey());
        }
        return arr;

    }
    
    public static void main(String[] args) {
        Assignment5 a=new Assignment5();
        a.saveCountryCapital("India", "Delhi");
        a.saveCountryCapital("Japan", "Tokyo");
        a.saveCountryCapital("America", "xyz");

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

