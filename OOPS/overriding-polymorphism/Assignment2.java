/*Write a program to create a class named shape. It should contain 2 methods, draw() and erase() that prints "Drawing Shape" and "Erasing Shape" respectively.
For this class, create three sub classes, Circle, Triangle and Square and each class should override the parent class functions - draw () and erase ().
The draw() method should print "Drawing Circle", "Drawing Triangle" and "Drawing Square" respectively.
The erase() method should print "Erasing Circle", "Erasing Triangle" and "Erasing Square" respectively.
Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
Shape c=new Circle(); Shape t=new Triangle(); Shape s=new Square();*/


public class Assignment2 {
    public static void main(String[] args){
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();

    }
    
}
class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("drawing triangle");
    }
    void erase(){
        System.out.println("erasing triangle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("drawing square");
    }
    void erase(){
        System.out.println("erasing square");
    }

}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
    void erase(){
        System.out.println("erasing circle");
    }

}
