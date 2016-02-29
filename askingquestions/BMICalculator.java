
package askingquestions;

/**
 *
 * @author Emmanuel Owusu
 * 10533695
 */
import java.util.Scanner;

public class BMICalculator {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
    
        double height;
        int weight;
        double BMI;
        
        System.out.print("Your height in m:  ");
        height = input.nextDouble();
        
        System.out.print("Your weight in kg:  ");
        weight = input.nextInt();
        
        BMI = (weight / (height*height));
        
        System.out.print("\nYour BMI is  " + BMI );
        
        
    }
    
}
