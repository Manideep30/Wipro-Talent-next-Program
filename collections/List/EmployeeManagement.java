import java.util.ArrayList;
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
    public void setSalary(float salary2){
        this.salary=salary2;
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

class EmployeeDB{
    ArrayList<Employee>arr=new ArrayList<>();

    boolean addEmployee(Employee e){
        return arr.add(e);
    }
    boolean deleteEmployee(int id){
        boolean isRemoved=false;
        for(int i=0;i<arr.size();i++){
            Employee e=arr.get(i);
            if(e.getEmpId()==id){
                arr.remove(e);
                isRemoved=true;
                break;
            }
        }
        return isRemoved;        
    }
    String getPaySlip(int id){
        String slip="Invalid empid";
        for(int i=0;i<arr.size();i++){
            Employee e=arr.get(i);
            if(e.getEmpId()==id){
                slip="empid "+e.getEmpId()+" EmpName :"+e.getName()+" Salary :"+e.getSalary();
                break;
            }
        }
        return slip;

    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1=new Employee(0, "manideep", "kukunarapumanideep@gmail.com", 'M', 85000);
        Employee e2=new Employee(1, "Rajesh", "rajesh@gmail.com", 'M', 85000);
        Employee e3=new Employee(2, "Ravi", "ravi@gmail.com", 'M', 85000);
        EmployeeDB edb=new EmployeeDB();
        edb.addEmployee(e1);
        edb.addEmployee(e2);
        edb.addEmployee(e3);
        String pay=edb.getPaySlip(0);
        System.out.println(pay);
    }
    
}
