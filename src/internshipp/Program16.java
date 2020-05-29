
package internshipp;
import java.util.Scanner;

public class Program16 {
       public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        char ch;
        int i,count =0;
        String arr[] = new String[5];
        System.out.println("plz enter Name of an name");
        for(i =0; i<5 ;i++)
        {
            arr[i] = sc.nextLine();
        }
        System.out.println("The name is........");
         for( i =0; i<5 ;i++)
        {
           ch = Character.toLowerCase(arr[i].charAt(0));
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
           {
               System.out.println(arr[i]); 
           }
           
        }
    }
}


