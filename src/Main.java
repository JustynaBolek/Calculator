import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        System.out.println(cal1.addition(4,6));
        System.out.println(cal1.subtraction(10,3));
        System.out.println(cal1.multiplication(2,2));
        System.out.println(cal1.division(30,5));
    }
}