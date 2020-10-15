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
 
        String DoB = eDate+"-"+eMonth+"-"+eYear;

        SimpleDateFormat f = new SimpleDateFormat("DD-MM-YYYY");
        Date date = f.parse(DoB);
        Instant instant = date.toInstant();
        ZonedDateTime zone= instant.atZone(ZoneId.systemDefault());
        LocalDate l= zone.toLocalDate();
        Period period=Period.between(l, LocalDate.now());

        System.out.println("\n\nHey "+eName+" you are now "+period.getYears()+" years old.");

    }

}