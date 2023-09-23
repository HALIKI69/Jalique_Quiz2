/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalique_quiz2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    
    void numbers(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            
            current = current.next ;
            
        }

        current.next = newNode ;
 
    }

    
    boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true; 
            }
            current = current.next;
        }
        return false; 
    }
}

public class Jalique_Quiz2 {

   
    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
         System.out.println("Choose quiz number:");
         int quiz = scn.nextInt();
               switch(quiz){
                   case 1:
                       Num1();
                       break;
                   case 2:
                       Num2();
                       break;
                   
               }
                       
                       
    }
    
    public static void Num1(){
    LinkedList list = new LinkedList();
       Scanner scn = new Scanner(System.in);
        System.out.println("1 13 39 41 24 69");
       
        list.numbers(1);
        list.numbers(13);
        list.numbers(39);
        list.numbers(41);
        list.numbers(24);
        list.numbers(69);
        System.out.println("Search Element:");
      int target = scn.nextInt();

        if (list.search(target)) {
            System.out.println(target + " is found in the linked list.");
        } else {
            System.out.println(target + " is not found in the linked list.");
        }
}
    
    public static void Num2(){
            class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1 || head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Invalid position. Inserting at the end.");
                insertAtEnd(data);
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

   
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


        LinkedList myList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

       
        while (true) {
            System.out.print("Enter data to insert (or -1 to exit): ");
            int data = scanner.nextInt();
            if (data == -1) {
                Scanner scn = new Scanner(System.in);
         System.out.println("Choose quiz number:");
         int quiz = scn.nextInt();
               switch(quiz){
                   case 1:
                       Num1();
                       break;
                   case 2:
                       Num2();
                       break;
                   
               }
                break;
            }
            System.out.print("Enter position: ");
            int position = scanner.nextInt();
            myList.insertAtPosition(data, position);
            myList.display();
        }

 
    
         
    }
    }
    
   

