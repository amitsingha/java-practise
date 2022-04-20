public class linked_list {

    Node head;
    private int total = 0;

    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
            total++;
        }
    }

    //add - first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            //total++;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add - Last
    public void addLast(String data){

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;     
    }

    public void printList(){
        if (head == null) {
            System.out.println("List is empt!");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data+" --> ");
            //System.out.print(currentNode.next+" --> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
        /*Node currentNode1 = head;
        while (currentNode1 != null) {
            //System.out.print(currentNode.data+" --> ");
            System.out.print(currentNode1.next+" --> ");
            currentNode1 = currentNode1.next;
        }
        System.out.println("");*/
    }

    //Delete First Node
    public void deleteFirst(){
        if (head == null) {
            System.out.println("Nothing to delete.");
            return;
        }

        /*Node currentNode = head;
        head = currentNode.next;*/
        head = head.next;
        total--;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("Nothing to delete.");
            return;
        }
        total--;
        Node currentNode = head;
        if (currentNode.next == null) {
            head = null;
            return;
        }

        while (currentNode.next.next != null ) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    public int totalElement(){
        return total;
    }
    public static void main(String[] args) {
        
        linked_list ll = new linked_list();
        ll.addFirst("data");
        ll.addFirst("data1");
        ll.addLast("data3");
        ll.printList();

        //ll.deleteFirst();
        //ll.printList();

        //ll.addLast("data2");
        //ll.printList();

        ll.deleteLast();
        ll.printList();
        int te = ll.totalElement();
        System.out.println(te);
    }
}
