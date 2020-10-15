import java.time.*;
import java.util.*;
import java.text.*;

public class EmpAgeCal{

    public static void main(String[] args) throws ParseException{

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the Employee Name : ");
        String eName = s.next();

        System.out.print("\nEnter the Employee birth date : ");
        String eDate = s.next();

        System.out.print("\nEnter the Employee birth month : ");
        String eMonth = s.next();

        System.out.print("\nEnter the Employee birth year : ");
        String eYear = s.next();
 
        System.out.print("\nEnter the Employee monthly salary : ");
        int mSalary = s.nextInt();
 
        String DoB = eDate+"-"+eMonth+"-"+eYear;

        int aSalary = mSalary*12;

        SimpleDateFormat f = new SimpleDateFormat("DD-MM-YYYY");
        Date date = f.parse(DoB);
        Instant instant = date.toInstant();
        ZonedDateTime zone= instant.atZone(ZoneId.systemDefault());
        LocalDate l= zone.toLocalDate();
        Period period=Period.between(l, LocalDate.now());

        System.out.println("\n\nHey "+eName+" you are now "+period.getYears()+" years old.");

        double tAmount;

        if(aSalary >= 500000 ){

            tAmount = (0.2*aSalary);
            System.out.println("\n\nYour annual salary is : "+aSalary+" and tax amount to be paid is : "+tAmount);

        }
        else if(aSalary >= 400000 && aSalary < 500000 ){

            tAmount = (0.15*aSalary);
            System.out.println("\n\nYour annual salary is : "+aSalary+" and tax amount to be paid is : "+tAmount);
            
        }
        else if(aSalary >= 300000 && aSalary < 400000 ){

            tAmount = (0.1*aSalary);
            System.out.println("\n\nYour annual salary is : "+aSalary+" and tax amount to be paid is : "+tAmount);
            
        }
        else if(aSalary >= 200000 && aSalary < 300000 ){

            tAmount = (0.05*aSalary);
            System.out.println("\n\nYour annual salary is : "+aSalary+" and tax amount to be paid is : "+tAmount);
            
        }
        else
        {
            
            System.out.println("\n\nYour annual salary is : "+aSalary+" and tax amount to be paid is : NIL");
            
        }

    }

}