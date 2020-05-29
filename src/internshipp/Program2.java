package internshipp;
import java.util.Scanner;

public class Program2 {
    
public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name,name1,name2,shortname;
        System.out.println("PLease enter Your First name  ");
        name = sc.next();
        System.out.println("PLease enter Your Second name  ");
        name1 = sc.next();
        
        System.out.println("PLease enter Your Third name  ");
        name2 = sc.next();
        
        System.out.println("Your FULL name is " + name +" " + name1 + " " + name2 );
        
        shortname = name.charAt(0) + "." + name1.charAt(0) + "." + name2.charAt(0);
        
        System.out.println("Your Short name is  " + shortname);
    }
}
