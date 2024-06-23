import java.util.TreeSet;
import java.util.Iterator;
public class Assignment3 {
    public static void main(String[] args) {
        TreeSet<String>ts=new TreeSet<>();
        ts.add("manideep");
        ts.add("maneesha");
        ts.add("vinisha");
        ts.add("manusha");
        ts.add("ameesha");

        Iterator<String>it=ts.descendingIterator();
        String name="manideep";
        boolean found=false;
        while(it.hasNext()){
            if(it.next().equals(name)){
                found=true;
            }
            System.out.println(it.next());
        }
        if(found){
            System.out.println(name+" is in the TreeSet");
        }
        else{
            System.out.println(name+" is not in the TreeSet");
        }


        
        
    }
    
}
