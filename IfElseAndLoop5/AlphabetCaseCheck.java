package IfElseAndLoop5;

import java.util.Scanner;
public class AlphabetCaseCheck {
    public static void AlphabetCaseCheckFunc() {
        System.out.print("Enter a letter to check whether it is uppercase or lowercase: ");
        Scanner inp = new Scanner(System.in);
        char ch = inp.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("Letter is in lowercase!");
        }else if (ch>='A' && ch<='Z'){
            System.out.println("Letter is in Uppercase!");
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
