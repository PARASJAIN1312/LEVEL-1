package internshipp;
import java.util.Scanner;

public class Program7 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String date;
        System.out.println("Plz Enter any date");
        date = sc.nextLine();
        if(date.equals("Monday"))
            System.out.println("Day is  " + 1);
        else if(date.equals("Tuesday"))
            System.out.println("Day is  " + 2);
        else if(date.equals("Wednesday"))
            System.out.println("Day is  " + 3);
        else if(date.equals("Thursday"))
            System.out.println("Day is  " + 4);
        else if(date.equals("Friday"))
            System.out.println("Day is  " + 5);
        else if(date.equals("Saturday"))
            System.out.println("Day is  " + 6);
        else if(date.equals("Sunday"))
            System.out.println("Day is  " + 7);
        else
            System.out.println("Day is not Exist");
        
    }
}
    
    
    

