
package askingquestions;

/**
 *
 * @author Emmanuel Owusus
 * 10533695
 * AskingQuestions
 
 */
import java.util.Scanner;
public class AskingQuestions {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        String height;
        double weight;
        
        System.out.print("How old are you? " );
        age = keyboard.nextInt();
        
        System.out.print("How tall are you? ");
        height = keyboard.next();
        
        System.out.print("How much do you weigh? ");
        weight = keyboard.nextDouble();
        
        System.out.println( "So you are "+ age +" old,"+height +"tall and "+ weight+ " heavy." );
        
        
        
    }
    
}
