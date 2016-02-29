
 
package askingquestions;

/**
 *
 * @author Emmanuel OWusu
 * 10533695
 */
import java.util.Scanner;
public class TheForgetfulMachine {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give me a word! ");
        input.next();
        
        System.out.print("Give me a second word! ");
        input.next();
        
        System.out.print("Great, now your favorite number? ");
        input.nextInt();
        
        System.out.print("And your second-favorite number? ");
        input.nextInt();
        
        System.out.println("Whew! Wasnt that fun?");
                
                
        
    }
}
