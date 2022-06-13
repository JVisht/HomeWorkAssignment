package Collections;


import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        LinkedList<Integer>code = new LinkedList<>();
         code.add(341);
         code.add(441);
         code.add(541);
         code.add(641);
         code.add(700);
         code.add(841);
         code.add(941);
         code.add(1041);

        for (int i = 0; i < code.size(); i++) {
            System.out.println(code.get(i));
        }
            code.remove(4);
        System.out.println(code);
         Iterator newCode = code.iterator();
        code.add(4,741);
        System.out.println(code);
           while( newCode.hasNext() ) {
           }  System.out.println(newCode.hasNext());



        }




    }

