public class Assignment1{
    public static void main(String[] args){
        Box b=new Box(5,6,5);
        System.out.println("The volume of box is: "+b.getVolume());
        
    }
}

class Box{
    private int length;
    private int width;
    private int height;

    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    int getVolume(){
        return length*width*height;
    }



}