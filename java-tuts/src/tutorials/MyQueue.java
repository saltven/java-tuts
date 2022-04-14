package tutorials;

public class MyQueue {
    private int capacity;
    private int size;
    private int idx_front;
    private int idx_back;
    private Object data[];

    public MyQueue(int capacity){
        this.capacity = capacity;
        idx_front = 0;
        idx_back = capacity - 1;
        size = 0;
        data = new Object[capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public int size(){
        return size;
    }

    public void enqueue(Object item){
        if (isFull())
            throw new IllegalArgumentException("Error: Queue is full.");
        else {
            idx_back = (idx_back + 1) % capacity;
            data[idx_back] = item;
            size++;
        }
    }

    public Object dequeue(){
        if (isEmpty())
            throw new IllegalArgumentException("Error: Queue is empty.");
        else {
            Object item = data[idx_front];
            idx_front = (idx_front + 1) % capacity;
            size--;
            return item;
        }
    }

    public Object front(){
        if (isEmpty())
            throw new IllegalArgumentException("Error: Queue is empty.");
        return data[idx_front];
    }

    public Object back(){
        if (isEmpty())
            throw new IllegalArgumentException("Error: Queue is empty.");
        return data[idx_back];
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }


        for(int i = idx_back, j = 0; j < size(); i--, j++) {
            System.out.print(data[i % capacity] + " ");
        }

    }

    public void print2(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }


        for(int i = idx_front, j = 0; j < size(); i++, j++) {
            System.out.print(data[i % capacity] + " ");
        }

    }
}
