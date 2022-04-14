package tutorials;

import java.util.Scanner;

public class Postfixcon {
    public static void main(String[] args) {
        InfixToPostfixConverter obj = new InfixToPostfixConverter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Infix : \t");
        String infix = sc.next();
        System.out.print("Postfix : \t"+obj.convertToPostfix(infix));
    }
}
