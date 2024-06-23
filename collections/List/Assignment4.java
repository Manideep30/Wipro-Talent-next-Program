import java.util.ArrayList;
public class Assignment4 {
    public static void main(String[] args) {
        ArrayList<Number>arr=new ArrayList<>();
        arr.add(2);
        arr.add(1.2f);
        arr.add(6.9d);
        for(Number i:arr){
            System.out.println(i);
        }
    }
    
}
