package IntroToJava1to4;

public class Mains {
    public static void main(String[] args) {
    //    System.out.println("Hello World");
    //    System.out.println("CSE-4H");
    //    int a = 10;
    //    System.out.println(a);
    //    System.out.println("The value of a is " + a);

    //    float P = 100000f, R = 2.5f, T = 2f;
    //    float SI = P*R*T/100;
    //    System.out.println("The simple interest is " + SI);

    //    int num = 3;
    //    if (num%2==0)
    //        System.out.println(num + " is an even number");
    //    else
    //        System.out.println(num + " is an odd number");

                int n = 4;
                int fac = 1;
        //        int f = fact(num);
        //        System.out.println(f);
               for (int i = 1; i<n; i++){
                    fac*= (i+1);
                }
                System.out.println(fac);
            }
        //    static int fact(int n){
        //        return n*fact((n-1));
        //    }
}
