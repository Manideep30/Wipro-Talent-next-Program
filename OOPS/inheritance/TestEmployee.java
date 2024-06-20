public class TestEmployee {
    public static void main(String [] args){
        Employee emp=new Employee("Rajendra",15000, "abc", 2002);
        Person p=new Person("Rajendra");
        System.out.println("EmpName: "+emp.getName()+" EmpSalary: "+emp.getAnnualSalary()+" Insuranceid: "+emp.getInsuranceId()+" Yearstarted: "+emp.getYearStarted());
        

    }
    
}
