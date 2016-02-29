/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifStatements;

/**
 * @ author Emmanuel Owusu
 * 
 */
import java.util.Scanner;
public class WeekdayName 
    {
        public static void main(String[] arg)
        {
            Scanner input = new Scanner(System.in);
            int num;
            
            System.out.printf("Weekday 1:Monday %n Weekday 2:Tuesday %n Weekday 3:Wednesday %n Weekday 4:Thursday %n Weekday 5:Friday %n Weekday 6:Saturday %n Weekday 7:Sunday%n Weekday 0:Sunday%n");
            System.out.println("Which weekday is today?");
            num=input.nextInt();
      if(num==1)
      {
        System.out.println("Today is Monday");
      }
        
      else if(num==2)
      {
        System.out.println("Today is Tuesday");
      }
       
       else if(num==3)
      {
        System.out.println("Today is Wednesday");
      }
        
        else if(num==4)
      {
        System.out.println("Today is Thursday");
      }
         
         else if(num==5)
      {
        System.out.println("Today is Friday");
      }
          else if(num==6)
      {
        System.out.println("Today is Saturday");
        
      }
           
           else if(num==7)
      {
        System.out.println("Today is Sunday");
      }
            
            else if(num==0)
      {
        System.out.println("Today is Sunday");
      }
      
        else
                {
                  System.out.println("Error!!");
                }
    }
}
