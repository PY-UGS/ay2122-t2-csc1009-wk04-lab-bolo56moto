
import java.util.Scanner;

public class BmiInput {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
       
        input.close();
        
        
        Bmi bmi = new Bmi(height,weight);
        System.out.println("BMI is " + bmi.getBmi());
        System.out.println(bmi.getBmiCat());

        
    }
}
