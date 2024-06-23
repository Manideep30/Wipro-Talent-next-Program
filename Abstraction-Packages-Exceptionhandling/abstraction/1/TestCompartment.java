import java.util.Random;

abstract class Compartment{
    public abstract String notice();

}

class FirstClass extends Compartment{
    public String notice(){
        return "first Class";
    }
}
class Ladies extends Compartment{
    public String notice(){
        return "Ladies Class";
    }
}
class General extends Compartment{
    public String notice(){
        return "General Class";
    }
}
class Luggage extends Compartment{
    public String notice(){
        return "Luggage Class";
    }
}

public class TestCompartment{
    public static void main(String[] args){
        Compartment[] compartments=new Compartment[10];
        Random rand=new Random();
        for(int i=0;i<10;i++){
            int random=1+(int)rand.nextInt(4);

            if(random==1){
                compartments[i]=new FirstClass();
            }
            else if(random==2){
                compartments[i]=new General();
            }
            else if(random==3){
                compartments[i]=new Ladies();
            }
            else{
                compartments[i]=new Luggage();
            }
        }
        for(Compartment com:compartments){
            System.out.println(com.notice());
        }


    }
}