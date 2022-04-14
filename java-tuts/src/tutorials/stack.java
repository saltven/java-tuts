package tutorials;

public class stack {
    private long capacity = 1000;
    private int idx_top;
    private Object data [];

    public stack(int capacity){
        idx_top = -1;
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public boolean isEmpty(){
        return (idx_top < 0);
    }

    public boolean isFull(){
        return (idx_top >= capacity - 1);
    }

    public int size(){
        return idx_top + 1;
    }

    public boolean push(Object x){
        if (isFull())
            throw new IllegalArgumentException("Error: Stack Overflow; Full stack");
        else {
            data[++idx_top] = x;
            return true; }
        }

    public Object pop(){
        if (isEmpty())
            throw new IllegalArgumentException("Error: Stack Underflow. Empty stack.");
        else{
            return data[idx_top--];
        }
    }

    public Object top(){
        if (isEmpty())
            throw new IllegalArgumentException("Error: Stack Underflow. Empty stack");
        else {
            return data[idx_top];
        }
    }

    public void print(){
        for(int i = size() - 1; i >= 0; i--)
                System.out.println(data[i]);
        }

    public int search(String x){
        for(int i = size() - 1; i >= 0; i--){
            if(data[i] == x)
                return i;
        }
        return -1;
    }

}
