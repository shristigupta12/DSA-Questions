package ClassQ;

import java.util.Scanner;

class A

{

    public void hello()

    {

        System.out.println("A's Hello ");

    }


    public void fun()

    {

        System.out.println("A's fun ");

    }


    public void fun2()
    {

        System.out.println("A's fun2 ");

    }

}



class B extends A

{

    public void test()

    {

        System.out.println("B's Test ....");

    }


    public void fun()

    {

        System.out.println("B's fun ");

    }

    public void fun2()
    {

        super.fun2();

        System.out.println("B's fun2 ");

    }

}



public class Table {
    /*public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int num = inp.nextInt();
//        System.out.println("The table of "+num+" is:");
//        int i=1;
//        while(i<=10){
//            System.out.println(num+" x "+i+" = "+num*i);
//            i++;
//        }*/





        public static void main(String [] args)

        {

            B ob = new B();

            ob.hello(); // Inherited Method --- Parent

            ob.test();

            ob.fun();
            ob.fun2();

        }

    }





