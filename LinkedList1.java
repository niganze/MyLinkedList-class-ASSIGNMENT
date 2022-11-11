
package javaapplication8;

/**
 *
 * @author Koica
 */
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList2 li  =  new LinkedList2();
        LinkedList2 l2  =  new LinkedList2();
        LinkedList2 l3  =  new LinkedList2();
        LinkedList2 l4  =  new LinkedList2();


        li.insertAtFront(12);
        li.insertAtBack(23);
        li.insertAtFront(98);

        l2.insertAtFront(1);
        l2.insertAtBack(2);
        l2.insertAtBack(9);
        
        System.out.println(l2.toString());
        System.out.println(li.isSorted(l2));
        l2.insertAtFront(8);
        System.out.println(li.isSorted(l2));

        l3.insertAtBack(0);
        l3.insertAtBack(1);
        l3.insertAtBack(3);
        l4.insertAtBack(2);
        l4.insertAtBack(6);
        l4.insertAtBack(7);

        System.out.println(l2.toString());
        System.out.println("final"+li.concantenate(l2).toString());
        System.out.println(l3.merge(l4));      
    }
}
