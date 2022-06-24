package method7;

import java.util.Scanner;

public class ShadowingC {
    int num = 90;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        int num ; /* This here is called shadowing because here the upper num is shadowed. Also this
                                       step is called Declaration of a variable*/
        num =  inp.nextInt(); /*This step is called Initialization*/
        System.out.println(num);

        // Shadowing only happens in this case unlike scoping which happens in function, loops etc.
        // After this the topic is method overloading which is the same as function overloading of c++.
    }
}
