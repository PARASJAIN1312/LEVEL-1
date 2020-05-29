package internshipp;
import java.util.Scanner;

public class Program4 {
     public static void main(String[] args){
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("PLEASE ENTER SOME STRING");
     String name;
     int 1;
     
      char ch1,ch;int count =0;
        name = sc.nextLine();
     
        1 = name.length();
        for( int i =0 ;i<1;i++)
        {
            ch1 = name.charAt(i);
            ch =  Character.toLowerCase(ch1);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
            }
        }
        System.out.println("The Total no. Vowel " + count);
        
    }
}

    
