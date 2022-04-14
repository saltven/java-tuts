package tutorials;

public class QueueTest {
    public static void main(String[] args){
        MyQueue a = new MyQueue(10);

        System.out.println("First In First Out = ");

        System.out.println(" ");

        a.enqueue("Job A");
        System.out.println("The jobs in queue:");
        a.print();

        a.enqueue("Job B");
        System.out.println("\nThe jobs in queue:");
        a.print();

        a.enqueue("Job C");
        System.out.println("\nThe jobs in queue:");
        a.print();

        a.enqueue("Job D");
        System.out.println("\nThe jobs in queue:");
        a.print();

        a.dequeue();
        System.out.println("\nFirst dequeue:");
        a.print();

        a.dequeue();
        System.out.println("\nSecond dequeue:");
        a.print();

        a.dequeue();
        System.out.println("\nThird dequeue:");
        a.print();

        a.dequeue();
        System.out.println("\nFourth dequeue:");
        a.print();



        System.out.println(" ");

        MyQueue b = new MyQueue(10);

        System.out.println("\nFirst In First Out (Exit from back) = ");

        b.enqueue("Job A1");
        System.out.println("\nThe jobs in queue:");
        b.print2();

        b.enqueue("Job B1");
        System.out.println("\nThe jobs in queue:");
        b.print2();

        b.enqueue("Job C1");
        System.out.println("\nThe jobs in queue:");
        b.print2();

        b.enqueue("Job D1");
        System.out.println("\nThe jobs in queue:");
        b.print2();

        b.dequeue();
        System.out.println("\nFirst dequeue:");
        b.print2();


        System.out.println("\nSecond dequeue:");
        b.dequeue();
        b.print2();

        System.out.println("\nThird dequeue:");
        b.dequeue();
        b.print2();

        System.out.println("\nFourth dequeue:");
        b.dequeue();
        b.print2();







    }
}
