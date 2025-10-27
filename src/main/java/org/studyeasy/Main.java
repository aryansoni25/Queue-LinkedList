package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList ql=new QueueLinkedList();
        ql.enQueue(4);
        ql.enQueue(5);
        ql.enQueue(6);
        System.out.println(ql.peek());


        System.out.println(ql.deQueue());


    }
}