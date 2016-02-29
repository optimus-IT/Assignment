
package askingquestions;

/**
 *
 * @author Emmanuel Owusu
 * 10533695
 */
import java.util.Scanner;
public class UserInformation {
    
    public static void main (String[] args ){
        
        Scanner input  = new Scanner(System.in);
        
        String firstname;
        String lastname;
        int level;
        String loginname;
        double GPA;
        int ID;
        
        System.out.print("First name: ");
        firstname = input.next();
        
        System.out.print("Last name: ");
        lastname = input.next();
        
        System.out.print("Level (100-400): ");
        level = input.nextInt();
        
        System.out.print("Student ID: ");
        ID = input.nextInt();
        
        System.out.print("Login name: ");
        loginname = input.next();
        
        System.out.print("GPA (0.0-4.0): ");
        GPA = input.nextDouble();
        
        System.out.println("Your Information: \n\t\t Login: " + loginname + "\n\t\t ID: " + ID + "\n\t\t Name: "+ lastname + "," + firstname + "\n\t\t GPA: " + GPA + "\n\t\t Level: " + level );
        
        
    }
}
