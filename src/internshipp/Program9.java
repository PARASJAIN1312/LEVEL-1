package internshipp;
import java.util.Scanner;


public class Program9 {
    

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("plz Enter some string");
    String name;
    int l;
    char ch;
    String str = "";
    name = sc.nextLine();
    l = name.length();
    for(int i=0;i<l;i++)
    {
       ch = name.charAt(i);
       str = ch + str;
    }
     if(name.equals(str))
     {
         System.out.println("palidrone");
     }
     else
     {
         System.out.println("Not a palidrme number");
     }
 }
}

