import java.util.HashSet;
import java.util.Iterator;;
public class Assignment1{
    HashSet<String>H1=new HashSet<>();

    HashSet<String> saveCountryName(String countryName){
        H1.add(countryName);
        return H1;
    }
    String getCountry(String countryName){
        Iterator<String>it=H1.iterator();
        while(it.hasNext()){
            if(it.next().equals(countryName)){
                return countryName;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Assignment1 a=new Assignment1();
        a.saveCountryName("India");
        a.saveCountryName("Austrila");
        a.saveCountryName("Japan");
        String ans=a.getCountry("India");
        System.out.println(ans);



        
        
    }
}