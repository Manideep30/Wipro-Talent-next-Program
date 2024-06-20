/*Create a base class Fruit with name,taste and size as its attributes.
Create a method called eat() which describes the name of the fruit and its taste.
Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.*/


public class Main {
    public static void main(String[] args){
        Apple a=new Apple();
        Mango m=new Mango();
        a.eat("Sweet");
        m.eat("Sour");

    }
    
}
class Fruit{
    String name;
    String taste;
    int size;

    void eat(String name,String taste){
        this.name=name;
        this.taste=taste;
        System.out.println("name :"+name+" ,taste :"+taste);

    }
}
class Apple extends Fruit{
    void eat(String taste){
        this.taste=taste;
        System.out.println("Taste of Apple class :"+taste);
    }

}
class Mango extends Fruit{
    void eat(String taste){
        this.taste=taste;
        System.out.println("Taste of Mango class :"+taste);
    }

}
