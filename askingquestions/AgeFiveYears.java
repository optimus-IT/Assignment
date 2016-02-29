
package askingquestions;

/**
 *
 * @author Emmanuel Owusu
 * 10533695
 */
import java.util.Scanner;
public class AgeFiveYears {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        
        
        System.out.print("Hello. What is your name? ");
        name = keyboard.next();
        
        System.out.print("Hi, " + name + "!  How old are you? ");
        age = keyboard.nextInt();
        
        System.out.println("Did you know that in five years you will be  " + (age + 5) + " years old? \n And five years ago you were " + (age - 5) + " ! Imagine that!" );
        
    }
    
}
