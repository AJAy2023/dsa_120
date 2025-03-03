package LinkedList_All;

class Node{

   int data;
    Node next;

    Node(int  data)
    {
        this.data = data;
        this.next = null;
    }

}

public  class llEx
{
    public static void main(String[] args) {
        Node first  = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

         // connection with nodes 

         first.next = second;
         second.next = third;

         //  printing the nodes 

         Node temp  = first;
         while (temp != null) {
             System.out.print(temp.data + " ->");
             temp = temp.next;
         }
         System.out.println("null");

    }
   
    
}