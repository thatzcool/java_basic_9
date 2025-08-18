package java_advanced_01.day15.collection.treeEx.bst;
//노드 클래스 만들기
public class NodeMgmt {

    Node head = null;

          public class Node{
              Node left, right;
              int value;
              public Node(int value) {
                  this.value = value;
                  this.left = null;
                  this.right = null;
              }
          }

          public boolean insertNode(int data) {
                //CASE1 : Node가 하나도 없을때
                   if(head == null) {
                       this.head = new Node(data);
                   } else {
                       Node findNode = this.head;
                       while(true) {
                           //CASE2:  Node가 하나 이상 들어가 있을때

                           //CASE2-1 현재 Node 왼쪽에 node가 들어가야 할때


                           //Case2-2 현재 Node 오른쪽에 node가 들어가야 할때

                       }
                   }
              return true;
          }
}
