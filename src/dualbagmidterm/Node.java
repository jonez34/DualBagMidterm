/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualbagmidterm;

/**
 *
 * @author hjones2368
 */
public class Node {
    
    public int data; //Entry in Bag
    public Node next; //Link to next node points to first node
    public Node prev;  //Link to prev node points to last node
    
    //constructor
    public Node(int data){
        this.data = data;
        
    }// end constructor
    public Node(int data, Node nextNode, Node prevNode){
        data = data;
        next = nextNode;
        prev = prevNode;
    }// end constructor
}//end Node
