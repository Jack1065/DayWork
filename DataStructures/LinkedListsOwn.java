package DataStructures;

public class LinkedListsOwn {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next=null;
        }

        //----intersting a node--------
        Node head;
        public void add(int data){
            Node toInsert = new Node(data);

            if (head == null) {
            head=toInsert; 
            return;
        }
            Node temp = head;

            while(temp.next!=null){
                
        }
        
    }
}
