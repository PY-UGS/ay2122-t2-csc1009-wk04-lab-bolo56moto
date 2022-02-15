import java.lang.Math;
public class Bmi {
    private double weight;
    private double height;

    private static final double METER_CONVERSION =  0.0254;
    private static final double WEIGHT_CONVERSION =  0.45359237;

    public Bmi(){

    }
    public Bmi(double height,double weight){
        double heightInM = height* METER_CONVERSION;
        double weightInKg = weight * WEIGHT_CONVERSION;
        setWeight(weightInKg);
        setHeight(heightInM);

    }
    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi(){
        double bmi =getWeight()/Math.pow(getHeight(),2);
        return bmi;
    }

    public String getBmiCat(){
        String bmiCat;
        double bmi = getBmi();
        if(bmi<18.5){
            bmiCat = "Underweight";
        }
        else if(bmi<25.0 && bmi>=18.5){
            bmiCat = "Normal";
        }
        else if(bmi<30 && bmi>=25){
            bmiCat = "Overweight";
        }
        else if(bmi>=30){
            bmiCat = "Obese";
        }
        else{
            bmiCat = "Error";
        }
        return bmiCat;
    
    }
}
