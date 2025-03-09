
class Node1 {
    String data;
    Node1 next;

    Node1(String data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtFirst {
    public static void main(String[] args) {
        Node1 str1 = new Node1("ashok");
        Node1 str2 = new Node1("jadhav");

        // Connection
        str1.next = str2; // ashok -> jadhav

        // Insert "ajay" at the beginning
        Node1 str3 = new Node1("ajay");
        str3.next = str1; // ajay -> ashok -> jadhav

        // Print the list from new head (str3)
        Node1 temp = str3;
        while (temp != null) {
            System.out.print(temp.data  + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
