public class LinkedList {
    private Node root;
    private Node tail;

    public void revert(){
        if (root == null || root.next == null){
            return;
        }
        Node currentNode = root; 
        while (currentNode != null) {
            Node next = currentNode.next; 
            Node previous = currentNode.previous;
            currentNode.next = previous; 
            currentNode.previous = next;
            if (previous == null) {
                root = currentNode;
            }
            if (next == null) {
                root = currentNode;
            }
            currentNode = next;
        }
    }

    
    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (root == null) {
            root = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }
    
    public void print() {
        System.out.print("[ ");
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }
    
    private class Node {
        public int value;
        public Node next;
        public Node previous;

        public Node() {
            value = 0;
            next = null;
        }

        public Node(int _value, Node _next, Node _previous) {
            this.value = _value;
            this.next = _next;
            this.previous = _previous;
        }
    }
}
