package java_advanced.day15.collection.linkedlistEx;

public class SingleLinkedListEx<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;
        public Node(T data){
            this.data = data;
        }
    }
    public void addNode(T data){
         if(head == null) {
             head = new Node<T>(data);
         } else{
             Node<T> node = this.head;
             while(node.next != null){
                 node = node.next;
             }
             node.next = new Node<T>(data);
         }
    }

    public void printAll(){
        if(head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data){
        return null;
    }

    public void addNodeInside(T data, T isData){             // 1,2,3,      addNodeInside(5,1)   1,5,2,3

    }

    public boolean deleteNode(T isData){
        return false;
    }

    public static void main(String[] args) {
          SingleLinkedListEx<Integer> myLinkedList = new SingleLinkedListEx<Integer>();
          myLinkedList.addNode(1);
          myLinkedList.addNode(2);
          myLinkedList.addNode(3);
          myLinkedList.addNode(4);
          myLinkedList.addNode(5);

//        System.out.println(myLinkedList.head.data);
//        System.out.println(myLinkedList.head.next.data);
//        System.out.println(myLinkedList.head.next.next.data);

          myLinkedList.printAll();

    }
}
