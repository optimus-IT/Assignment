
package askingquestions;

/**
 *
 * @author Emmanuel Owusu
 */
import java.util.Scanner;

public class DumbCalculator {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double num1;
        double num2;
        double num3;
        double sum;
        
        System.out.print("What is your first number? ");
        num1 = input.nextDouble();
        
        System.out.print("What is your second number? ");
        num2 = input.nextDouble();
        
        System.out.print("What is your third number? ");
        num3 = input.nextDouble();
        
        sum = (num1 + num2 + num3)/2;
        
        System.out.print((num1 + " + " + num2 + " + " + num3) + "/ 2 is ...  " + sum );
        
    }
    
}
