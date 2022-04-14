package tutorials.SelectionSort;

import java.util.Random;

public class SelectionSortArray {
    public static void main(String [] args){

        int maxSize = 4;
        MySelectionSort a = new MySelectionSort(maxSize);

        int number;

        Random randomNumber = new Random();

        for(int i = 0; i < maxSize; i++){
            number = randomNumber.nextInt(100);
            a.insert(number);
        }

        System.out.println("Before sorting:\n");
        a.display();

        System.out.println("\n\n\nAfter sorting:\n");
        a.SelectionSort();
        a.display();
    }
}
