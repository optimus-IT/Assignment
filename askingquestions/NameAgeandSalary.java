
package askingquestions;

/**
 *
 * @author Emmanuel Owusu
 * 10533695
 */
import java.util.Scanner;
public class NameAgeandSalary {
    
    public static void main (String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        double salary;
        
        System.out.print("Hello.  What is your name? ");
        name = keyboard.next();
        
        System.out.print("Hi, "+name+ "  How old are you? ");
        age = keyboard.nextInt();
        
        System.out.print("So you are " + age + " eh?  That's not old at all! \nHow much do you make, " + name+"?");
        salary = keyboard.nextDouble();
        
        System.out.print(salary +" !  I hope that's per hour and not per year! LOL!");
        
        
    }
}
