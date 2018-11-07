package com.zipcodewilmington.singlylinkedlist.ChristianSheridan;

import javafx.scene.chart.PieChart;

import javax.swing.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList implements Cloneable {

    protected SinglyLinkedList clone() throws CloneNotSupportedException{
        return (SinglyLinkedList)super.clone();
    }

    SinglyLinkedList (){
    }

    public Node head;

    public class Node implements Cloneable {

        int data;
        Node next;


        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
            }

            protected Node clone() throws CloneNotSupportedException
            {
                return (Node) super.clone();
            }
        }



    public void add(int data) {
        if (head == null) {
            head = new Node(data, null);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data, null);
    }


    public void addNewHead(int data) {
        Node newHead = new Node(data, null);
        newHead.next = head;
        head = newHead;
    }

    public void remove(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while (current.next != null) {
            if (current.data == data) {
                return true;
            } current = current.next;
        }
        return false;
    }

    public int find(int data) {
        Node current = head;
        int count = 0;
        while (current.data != data) {
            count++;
            current = current.next;
        } if (current.data == data){
            return count;
        }
        return -1;
    }

    public int size() {
        Node current = head;
        int count = 1;
        while (current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public int get(int data) {
        Node current = head;
        int count = 0;
        while (count != data){
            count++;
            current = current.next;
        } return current.data;
    }

    public SinglyLinkedList copy(){

        SinglyLinkedList copyOf = new SinglyLinkedList();

        Node nodeCopy;
        Node current = head;
        while(current != null){
            nodeCopy = current;
            current = current.next;
            copyOf.add(nodeCopy.data);
        }
        return copyOf;
    }

    public SinglyLinkedList sort(){

        SinglyLinkedList sorted = new SinglyLinkedList();

            if (size() >1)
            for (int i = 0; i <size(); i++){
                Node currentNode = head;
                Node next = currentNode.next;
                Node temp = new Node(0,null);
                for (int j = 0; j < size()-1; j++){
                    if (currentNode.data > next.data){
                        temp.data = currentNode.data;
                        currentNode.data = next.data;
                        next.data = temp.data;
                    }
                    currentNode = next;
                    next = next.next;
                }
            }
        return sorted;
    }

}


