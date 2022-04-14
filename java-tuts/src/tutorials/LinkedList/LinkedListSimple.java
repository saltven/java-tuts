package tutorials.LinkedList;

public class LinkedListSimple {
    private LLNode firstNode;

    public LinkedListSimple(){
        firstNode = null;
    }

    public LinkedListSimple(Object obj){
        firstNode = new LLNode(obj);
    }

    boolean isEmpty(){
        return (firstNode == null);
    }

    public void insert_node(Object obj, int idx_pos){
        if(idx_pos == 0){
            LLNode temp = new LLNode(obj);
            temp.next = firstNode;
            firstNode = temp;
        }
        else{
            LLNode node = firstNode;
            for(int i = 1; i < idx_pos; i++)
                node = node.next;
            LLNode rec = node.next;
            node.next = new LLNode(obj);
            node.next.next = rec;
        }
    }

    public void print_list(){
        if(isEmpty())
            System.out.println("The linked list is empty.");
        else{
            LLNode node;
            System.out.print("[Head]");
            for(node = firstNode; node.next != null; node = node.next)
                System.out.print(node.data + ", ");
            System.out.println(node.data);

        }
    }

}
