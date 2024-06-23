import java.util.HashSet;
import java.util.Iterator;;
public class Assignment2 {
    public static void main(String[] args) {
        HashSet<String>empNames=new HashSet<>();
        empNames.add("Mahesh");
        empNames.add("Abhigna");
        empNames.add("Aishwarya");
        empNames.add("Ramya");

        Iterator<String>it=empNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());           
        }

        
        
    }
    

    
}
