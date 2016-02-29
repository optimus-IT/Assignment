
package ifStatements;

/**
 *
 * @author Emmanuel Owusu
 * 10533695
 */
import java.util.Scanner;

public class HowOldareYou {
    
      public static void main(String[] arg)
        {
          Scanner input = new Scanner(System.in);
          String name;
          int age;
            
          System.out.println("What is your name");
          name=input.next();
          
          System.out.println("What is your age");
          age=input.nextInt();
          
          if(age<16)
          {
              System.out.printf("You cannot drive, %s%n",name );
          }
          
          if(age<18)
          {
               System.out.printf(" You cannot vote, %s%n",name );
          }
          if(age<25)
          {
              System.out.printf("You cannot rent a car, %s ,sorry man:-( %n",name );
          }
          if(age>25)
          {
               System.out.printf("You can do anything that is legal");
          }
        }
    
}
