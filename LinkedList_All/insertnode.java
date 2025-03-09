class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
public class insertnode {
public static void main(String[] args) {
    Node list1 = new Node(1);
    Node List2 = new Node(2);
    Node list3 = new Node(3);

    // connection

    list1.next = List2;
    List2.next = list3;


    Node temp = list1;
    while (temp != null) {
        System.out.print(temp.data  + "->");
        temp = temp.next;
    }
    System.out.println("null");
}
    
}