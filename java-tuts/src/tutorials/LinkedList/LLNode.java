package tutorials.LinkedList;

public class LLNode {
    public Object data;
    public LLNode next;

    public LLNode(){
        this.next = null;
        this.data = null;
    }

    public LLNode(Object data){
        this.next = null;
        this.data = data;
    }

    public LLNode(LLNode node, Object data){
        this.next = null;
        node.next = this;
        this.data = data;
    }
}
