/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualbagmidterm;

/**
 *
 * @author Henry Jones
 */
public class LinkedBagTest {
    public Node root;
    public Node temp;
    public Node current;
    
    public void addNodes(int data){
        Node node = new Node(data);
        
        if (root==null){
            root = node;
            root.prev = null;
            root.next = null;
        }else{
            current = root;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
            node.prev = current;
            node.next = null;
        }        
    }
    public void insertNodes(int data, int after){
        Node node = new Node(data);
        int ithNode =1;
        current = root;
        while(ithNode != after){
            current.next = root;
            
            ithNode++;
        }
        temp = current.next;
        
        current.next = node;
        node.next = temp;
        temp.prev = node;
        node.prev = current;
        
    }
    public void deletNodes(int nodeNumber){
        int ithNode = 1;
        
        current = root;
        
        if(nodeNumber ==1){
            root = current.next;
            current.next = null;
            current.prev = null;
        }else{
            while(ithNode != nodeNumber){
                current = current.next;
                
                
                ithNode++;
            }
            if(current.next == null){
                current.prev.next = null;
                current.prev = null;
            }else{
                current.prev.next =null;
                current.next.prev = current.prev;
            }
        }
    }
    public static void main(String[] args){
        LinkedBagTest list = new LinkedBagTest();
        
        list.addNodes(1);
        list.addNodes(2);
        //list.addNodes(3);
        //list.addNodes(4);
        //list.addNodes(5);
        //list.addNodes(6);
    
    }
    
    
    if(firstNode==null){
            firstNode = newNode;
            firstNode.prev = null;
            firstNode.next = null;
        }else if(firstNode.data>data){
            //add before first Node
            
            firstNode = lastNode;
            while(firstNode.prev!=null){
                firstNode = firstNode.prev;
            }
            firstNode.next = newNode;
            newNode.prev = firstNode;
            newNode.next = null;
            firstNode = firstNode.next;
            
        }else if(lastNode.data<data){
            
            //add to the end
            lastNode = firstNode;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
            newNode.next = null;
            lastNode = lastNode.next;
            
        }else{
            
        }
           
        numberofEntries++;
        System.out.println("Created New node");
    
    
    
    
    
}
currentNode = newNode;
            Node iterator1 = firstNode;
            Node iterator2 = lastNode;
            Node previous = null;
            Node next = null;
            boolean found = false;

            while (!found && iterator1 != null && iterator2 != null) {

                if (iterator1.data < currentNode.data && iterator2.data == currentNode.data) {
                    if (previous == null) {
                        //This handles the first node
                        

                    } else if (next == null) {
                        //This handles the last node
                        

                    } else {
                        
                        iterator2.prev.next = currentNode.next;
                        iterator1.next.prev = currentNode.prev;
                        iterator1.next = currentNode;
                        iterator2.prev = currentNode;
                    }
                    found = true;
                    //break;
                }
                if (iterator1.data != currentNode.data) {
                    previous = iterator1;
                    iterator1 = iterator1.next;
                }
                if (iterator2.data != currentNode.data) {
                    next = iterator2;
                    iterator2 = iterator2.prev;
                }
            }

        