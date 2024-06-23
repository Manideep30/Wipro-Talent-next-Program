import java.util.ArrayList;
import java.util.Iterator;
public class Assignment3 {
    static void printAll(ArrayList <String>arr){
        Iterator<String>it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>();
        arr.add("Manideep");
        arr.add("Naveen");
        arr.add("Vinisha");
        arr.add("Pavan");
        arr.add("Jeevan");
        printAll(arr);

        
    }
    

    
}
