package ClassQ;

import java.util.Scanner;

public class StudentRec {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter marks in subject 1 : ");
        float s1 = inp.nextFloat();
        System.out.print("Enter marks in subject 2 : ");
        float s2 = inp.nextFloat();
        System.out.print("Enter marks in subject 3 : ");
        float s3 = inp.nextFloat();
        System.out.print("Enter marks in subject 4 : ");
        float s4 = inp.nextFloat();
        System.out.print("Enter marks in subject 5 : ");
        float s5 = inp.nextFloat();
        float avg = (s1+s2+s3+s4+s5)/5;
        float perc = ((s1+s2+s3+s4+s5)/500)*100;
        System.out.println("The percentage of the student is : "+perc);
        System.out.println("The average marks are : "+avg);
        if (avg>90 && avg<=100){
            System.out.println("The grade of the student is A");
        }
        else if(avg>80 && avg<=90){
            System.out.println("The grade of the student is B");
        }
        else if(avg>70 && avg<=80){
            System.out.println("The grade of the student is C");
        }
        else if(avg>60 && avg<=70){
            System.out.println("The grade of the student is D");
        }
        else{
            System.out.println("The grade of the student is E");
        }
    }
}
