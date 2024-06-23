import java.util.ArrayList;
public class Assignment1{
    public static void main(String[] args){
        ArrayList<String>arr=new ArrayList<>(12);
        arr.add("January");
        arr.add("Feburary");
        arr.add("March");
        arr.add("April");
        arr.add("May");
        arr.add("June");
        arr.add("July");
        arr.add("August");
        arr.add("September");
        arr.add("October");
        arr.add("November");
        arr.add("December");
        
        for(String i:arr){
            System.out.println(i);
        }


    }
}