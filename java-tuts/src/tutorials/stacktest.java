package tutorials;

import java.util.Scanner;

public class stacktest {
    public static void main (String[] args){
        stack ringgit = new stack(5);

        ringgit.push("RM1");
        ringgit.push("RM5");
        ringgit.push("RM10");
        ringgit.push("RM20");
        ringgit.push("RM50");

        ringgit.print();

        ringgit.pop();
        System.out.println("After popping");
        ringgit.print();


        System.out.println("The current top item: " + ringgit.top());
        ringgit.print();

        System.out.println("Is the stack empty? " + ringgit.isEmpty());

        System.out.println("Is the stack full? " + ringgit.isFull());

        System.out.println("How many items in the stack: " + ringgit.size());

        Scanner s = new Scanner(System.in);
        System.out.println("Search for a note");
        String note = s.nextLine();

        System.out.println("The note is found at index: " + ringgit.search(note));






    }
}
