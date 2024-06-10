/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%. If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%. If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.*/


public class Assignment3 {
    public static void main(String [] args){
        String s1=args[0];
		int age=Integer.parseInt(args[1]);
		if(s1.equals("Female") && (age>=1 && age<=58)){
		    System.out.println("intrest is 8.2%");
		}
		else if(s1.equals("Female") && (age>=59 && age<=100)){
		    System.out.println("intrest is 9.2%");
		}
		else if(s1.equals("Male") && (age>=1 && age<=58)){
		    System.out.println("intrest is 8.4%");
		}
		else if(s1.equals("Male") && (age>=59 && age<=100)){
		    System.out.println("intrest is 10.5%");
		}
    }
    
}
