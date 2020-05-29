package internshipp;
import java.util.Scanner;


public class Program18 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("please enter an string");
      String str;
      int l;
      str = sc.nextLine();
      str = str.toLowerCase();
      l = str.length();
      char ch;
      int s;
      for(s='a';s<='z';s++)
      {
          int count = 0;
         for(int i=0;i<l;i++)
         {
            ch = str.charAt(i);
            if(ch==s)
            {
               count++; 
            }
         }
          
         if(count>0)
         {
             System.out.println("The Frequency of an no. is" + " " +s+ " " + count);
         }
      }
        
      
    }
    
}
