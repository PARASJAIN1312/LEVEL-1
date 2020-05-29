

package internshipp;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter any String");
     String name;
     int l;
     char ch,ch1;
     String  str = "";
     name = sc.nextLine();
     l = name.length();
     for(int i =0 ;i< l; i++)
     {
        ch = name.charAt(i);
        if(i%2==0)
        {
          ch1 =   Character.toLowerCase(ch);
        }
        else
        {
          ch1 = Character.toUpperCase(ch);
        }
         str = str  + ch1;
     }
       System.out.println("The Resulting String is " + str);
     
   }
   
}
