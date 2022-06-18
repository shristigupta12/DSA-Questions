package ClassQ;

import java.util.Scanner;

public class tempConversion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        float f = inp.nextFloat();
        float c = (f-32)*5/9f;
        System.out.println("Temperature in Celsius : "+c);
    }
}
