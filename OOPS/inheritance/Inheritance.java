public class Inheritance{
    public static void main(String [] args){
        Bird b=new Bird();
        b.eat();
        b.sleep();
        b.fly();

    }
}

class Animal{
    void eat(){
        System.out.println("This is eat method of Animal class");
    }
    void sleep(){
        System.out.println("This is sleep method of Animal class");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Bird class..... Birds can fly");
    }
}