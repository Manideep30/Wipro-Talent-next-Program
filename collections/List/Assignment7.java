import java.util.Vector;
import java.util.Iterator;;

class Employee{
    private int empId;
    private String empName;
    private String email;
    private char gender;
    private float salary;

    public Employee(int empid,String empName,String email,char gender,float salary){
        setEmpId(empid);
        setSalary(salary);
        setName(empName);;
        setEmail(email);
        setGender(gender);
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public void setName(String empName){
        this.empName=empName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    public int getEmpId(){
        return empId;
    }
    public String getName(){
        return empName;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public float getSalary(){
        return salary;
    }

    public String getEmployeeDetails(){
        return String.valueOf(getEmpId())+" "+getName()+" "+getEmail()+" "+String.valueOf(getGender())+" "+String.valueOf(getSalary());
    }
}
public class Assignment7 {
    public static void main(String[] args) {
    Vector<Employee>v=new Vector<>();
    Employee e1=new Employee(0,"manideep","kukunarapumanideep@gmail.com",'M',85000);
    Employee e2=new Employee(1, "Rajesh", "rajesh@gmail.com", 'M', 85000);
    Employee e3=new Employee(2, "Ravi", "ravi@gmail.com", 'M', 85000);
    v.add(e1);
    v.add(e2);
    v.add(e3);
    Iterator<Employee>it=v.iterator();

    while(it.hasNext()){
        System.out.println(it.next().getEmployeeDetails());
    }
        
    }
    

    
}
