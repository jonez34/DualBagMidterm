/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualbagmidterm;

import static java.util.Optional.empty;

/**
 *
 * @author Henry Jones
 */
public class LinkedBag {

    private Node firstNode; //
    private Node currentNode;
    private Node lastNode;
    private int numberofEntries;

    public LinkedBag() {
        firstNode = null;
        lastNode = null;
        currentNode = null;
        numberofEntries = 0;
    }

    public void add(int data) {

        Node newNode = new Node(data);
            //empty
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
            firstNode.prev = null;
            firstNode.next = null;
            lastNode.prev = null;
            lastNode.prev = null;
        } else if (firstNode.data > data) {
            //add before first Node

            firstNode = lastNode;
            while (firstNode.prev != null) {
                firstNode = firstNode.prev;
            }
            firstNode.prev = newNode;
            newNode.next = firstNode;
            newNode.prev = null;
            firstNode = firstNode.prev;

        } else if (lastNode.data < data) {

            //add to the end
            lastNode = firstNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
            newNode.next = null;
            lastNode = lastNode.next;

        } else {
            if (firstNode != lastNode){
                Node current = firstNode;
                while(current != null){
                    if(current.data > data){
                        if(current == firstNode){
                            current.prev = newNode;
                            newNode.next =current;
                            firstNode = newNode;
                            return;
                        }
                        newNode.next = current;
                        newNode.prev = current.prev;
                        current.prev.next = newNode;
                        current.prev = newNode;
                        return;
                }
                    current = current.next;
            }
                
                newNode.prev = lastNode;
                lastNode.next = newNode;
                lastNode = newNode;
                return;  
        }
        }    
        numberofEntries++;
        System.out.println("Created New node");
    }

    public void removefirst() {
        if (numberofEntries > 0) {
            firstNode = firstNode.next;
            firstNode.prev = null;
            numberofEntries--;
            System.out.println("Deleted Node");
        } else {
            System.out.println("Nothing to Remove");
        }

    }

    public void removelast() {
        if (numberofEntries > 0) {
            lastNode = lastNode.prev;
            lastNode.next = null;
            numberofEntries--;
            System.out.println("Deleted Node");
        } else {
            System.out.println("Nothing to Remove");
        }
    }

    public void removeAll() {
        System.out.println("Everythng has been Erased");
        firstNode = null;
        lastNode = null;
        numberofEntries = 0;

    }

    public void removeItem(int item) {
        Node iterator1 = firstNode;
        Node iterator2 = lastNode;
        Node previous = null;
        Node next = null;
        boolean found = false;

        while (!found && iterator1 != null && iterator2 != null) {

            if (iterator1.data == item && iterator2.data == item) {
                if (previous == null) {
                    //This handles the first node
                    removefirst();

                } else if (next == null) {
                    //This handles the last node
                    removelast();

                } else {
                    iterator2.prev.next = iterator2.next;
                    iterator1.next.prev = iterator1.prev;
                    numberofEntries--;
                }
                found = true;
                //break;
            }
            if (iterator1.data != item) {
                previous = iterator1;
                iterator1 = iterator1.next;
            }
            if (iterator2.data != item) {
                next = iterator2;
                iterator2 = iterator2.prev;
            }
        }
    }

    public void noOfitems() {
        System.out.println("The Number of Nodes in the Bag is " + numberofEntries);
    }

    public boolean isEmpty() {
        boolean result;

        if (numberofEntries == 0) {
            result = true;

        } else {
            result = false;

        }

        return result;
    }
    //public void removeItem2(String item){
    //boolean found = false;
    //Node currentNode = firstNode;

    //if (currentNode.data != item){
    //}
    //}
    public String toString() {
        Node iterator = firstNode;
        String result = "";
        int next = 0;
        int prev = 0;
        while (iterator != null) {
            if (iterator.next != null) {
                next = iterator.next.data;
            }
            if (iterator.prev != null) {
                prev = iterator.prev.data;
            }

            result += "\n" + iterator.data + " Next = " + next
                    + " Prev = " + prev;
            iterator = iterator.next;
            next = 0;
            prev = 0;
        }
        return result;

    }
}
