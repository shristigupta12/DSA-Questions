package IntroToJava1to4;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        // By default bigger data type can be converted to smaller but not smaller
//            float num = input.nextFloat();
            // int num = input.nextFloat(); ---> This will give error!
        // So to tackle this problem
//        int number = (int)(num);
//        System.out.println(number);

        // double > float > long > int > byte > char
//        int a = input.next().charAt(0);
//        System.out.println(a);

        //Temperature conversion
        System.out.print("Enter a temperature in Celsius : ");
        Scanner inpTempC = new Scanner(System.in);
        float tempC = inpTempC.nextFloat();
        System.out.println("Temperature in Fahrenheit : " + ((tempC*9/5)+32));

    }
}