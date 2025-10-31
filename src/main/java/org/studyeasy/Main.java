package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList ql=new QueueLinkedList();
        ql.enQueue(4);
        ql.enQueue(5);
        ql.enQueue(6);
        System.out.println(ql.peek());
        ql.enQueue(7);
        ql.enQueue(8);
        System.out.println(ql.deQueue());

        System.out.println(ql.deQueue());
    }
}