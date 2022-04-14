package tutorials.LinkedList;
import tutorials.LinkedList.LinkedListSimple;

import java.util.Random;

public class LinkedListTest {
    public static void main(String [] args){
        LinkedListSimple a = new LinkedListSimple();

        int sum = 0;
        double average = 0.0;
        int number;

        Random randomNumber = new Random();

        for(int i = 0; i < 10; i++){
            number = randomNumber.nextInt(100);
            a.insert_node(number, i);
            sum += number;
        }
        average = sum/25;
        a.print_list();

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);



    }
}
