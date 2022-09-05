import java.util.Random;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        printStr();
        print1To100();
        zugiOrNotZugi();
        zugiOrNotZugi(scan);
        printBiggest();
        printBiggest(2);
        printBiggest(3, 5);
        printBiggest(2, 5, 6);
        getFloat(scan);
        createRandom(r, 10, 20);
    }

    //HomeWork solutions
    //Create a function that prints "To be or not to be", call it from main
    //1
    public static void printStr() {
        System.out.println("To be or not to be");
    }

    //2
    public static void print1To100() {
        for (int index = 1; index <= 100; index++) {
            System.out.println(index);
        }
    }

    //3
    public static void zugiOrNotZugi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.printf("%d is even", number);
        } else {
            System.out.printf("%d is odd", number);
        }
    }

    //4
    public static void zugiOrNotZugi(Scanner scan) {
        System.out.println("Please enter a number:");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.printf("%d is even", number);
        } else {
            System.out.printf("%d is odd", number);
        }
    }

    //5 etgar
    //6 (method overloading)
    public static void printBiggest() {
        System.out.println("I am the biggest of them all");
    }

    public static void printBiggest(int a) {
        System.out.println(a + "is biggest");
    }

    public static void printBiggest(int a, int b) {
        if (a > b) {
            System.out.println(a + "is biggest");
        } else if (a < b) {
            System.out.println(b + "is biggest");
        } else {
            System.out.println("numbers are equal");
        }
    }

    public static void printBiggest(int a, int b, int c) {
        int max = Math.max(a, b);
        if (a != b && a != c && b != c) {
            if (max > b) {
                max = Math.max(a, c);
                System.out.println(max + "is biggest");
            } else {
                max = Math.max(b, c);
                System.out.println(max + "is biggest");
            }
        } else {
            System.out.println("numbers are the same");
        }
    }

    //7
    public static void getFloat(Scanner scan) {
        System.out.println("Please enter float:");
        float f = scan.nextFloat();
        System.out.println(f);
    }

    //8
    public static void createRandom(Random r, int min, int max) {
        int random_number = r.nextInt(max - min + 1) + min;
        System.out.println("the lowest number in the range is " + min);
        System.out.println("the highest number in the range is " + max);
        System.out.println("the random number this method created is " + random_number);
    }

}
