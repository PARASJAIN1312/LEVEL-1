package internshipp;
import java.util.Scanner;

public class Program14 {
 
    public static void main(String[] args)
    {
        String s1 = "15 august is independence day";
        String s2 = s1.replace("15", "26");
        String s3 = s2.replace("august", "january");
        String s4 = s3.replace("independence", "republic");
        System.out.println(s4);
    }
}
   

