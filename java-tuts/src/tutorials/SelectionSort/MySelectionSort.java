package tutorials.SelectionSort;

public class MySelectionSort {
    private int [] array;
    private int index;

    public MySelectionSort(int max){
        array = new int[max];
        index = 0;
    }

    public void insert(int value){
        array[index] = value;
        index++;
    }

    private void Swap(int outer, int min){
        int temp = array[outer];
        array[outer] = array[min];
        array[min] = temp;
    }

    public void display(){
        for(int i = 0; i < index; i++)
            System.out.print(array[i] + " , ");
    }

    public void SelectionSort(){
        int outer, min;
        int inner = 0;

        for(outer = 0; outer < index - 1; outer++){
//            System.out.println("Outer: " + array[outer]);

            min = outer;

//            System.out.println("Min is outer: " + array[min]);

            for(inner = outer + 1; inner < index; inner++){
//                System.out.println("Inner: " + inner);

                if(array[inner] < array[min]){
                    min = inner;
//                    System.out.println("Min is inner: " + min);
                }
            }
            Swap(outer, min);
//            System.out.println("Swap: " + outer + " with min: " + min);
        }
    }


}
