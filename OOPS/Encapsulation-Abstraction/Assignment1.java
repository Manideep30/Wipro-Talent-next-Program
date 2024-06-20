public class Assignment1{
    public static void main(String[] args){
        Author a=new Author("James","jammy@gmail.com",'M');
        Book b=new Book("Manideep",500.0,2,a);
        System.out.println(b);
        
        


    }
}
class Author{
    private String name;
    private String email;
    private char gender;

    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    char getGender(){
        return gender;
    }

    
    public String toString(){
        return "Author[Name :"+name+", email: "+email+", gender: "+gender+"]";
    }
}

class Book{
    private String name;
    private double price;
    private int quantityInStock;
    private Author author;

    Book(String name,double price,int quantityInStock,Author author){
        this.name=name;
        this.price=price;
        this.quantityInStock=quantityInStock;
        this.author=author;
    }
    String getCustName(){
        return name;
    }
    double getPrice(){
        return price;
    }
    int getQuantity(){
        return quantityInStock;
    }
    Author getAuthor(){
        return author;
    }

    void setPrice(double price){
        this.price=price;
    }

    void setQuantity(int quantityInStock){
        this.quantityInStock=quantityInStock;
    }

    public String toString(){
        return "Custname : "+name+ ","+"Price : "+price+","+"Quantity :"+quantityInStock+","+"Author :"+author;
    }

    
    
}