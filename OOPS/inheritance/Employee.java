public class Employee extends Person {
    private double annualSalary;
    private String insuranceId;
    private int yearStarted;

    public Employee(String name,double annualSalary,String insuranceId,int yearStarted){
        super(name);
        this.annualSalary=annualSalary;
        this.insuranceId=insuranceId;
        this.yearStarted=yearStarted;

    }

    void setAnnualSalary(double annualSalary){
        this.annualSalary=annualSalary;
    }

    double getAnnualSalary(){
        return annualSalary;
    }

    void setInsuranceId(String insuranceId){
        this.insuranceId=insuranceId;
    }
    String getInsuranceId(){
        return insuranceId;
    }
    void setYearStarted(int yearStarted){
        this.yearStarted=yearStarted;
    }
    int getYearStarted(){
        return yearStarted;
    }
    
}
