import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        printFirstName();
        printLastName();
        addNames();
        addNumbers(5);
        print10To20();
        System.out.println(equalNumbers(5, 5));
        myAdd();
        myAdd(2);
        myAdd(2, 3);
    }


    private static void print10To20() {
        for (int a = 10; a <= 20; a++) {
            System.out.println(" a is " + a);
        }
    }


    public static void printFirstName() {
        System.out.println("My name is shimrit");

    }

    public static void printLastName() {
        System.out.println("My last name is: breef ziskand");

    }

    public static void addNames() {
        int shimrit = 7;
        int ziskand = 7;
        System.out.println("The number of characters in my full name is : " + (shimrit + ziskand));
    }


    public static void addNumbers(int a) {
        int b = 5;
        int sum = b + a;
        System.out.println("The sum of a & b is: " + sum);
    }

    public static String getName() {
        String name = "shim";
        return name;
    }

    //methods that Return a value (not void)
    //int example
    //multiplyNumbers continue with that example  - method returns int (not void)
    //public static int multNumbers(inat a) {}
    //the returned value from the method antwered the answer variable
    //to print the method straight inside the sout

    // boolean example
    //a method that checks and returns wether the parameters are equale
    public static boolean equalNumbers(int r, int t) {
        if (r == t) {
            return true;
        } else {
            return false;
        }
    }

//
//    //Method overloading (different number of parameter)

    private static void myAdd() {
        int a = 2;
        int b = 3;
        System.out.println(a + b);
    }

    private static void myAdd(int a) {
        System.out.println(a + 1);
    }

    private static void myAdd(int a, int b) {
        System.out.println(a + b);
    }
}
