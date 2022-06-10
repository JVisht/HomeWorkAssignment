package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {


    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        ArrayList<Object>employees = new ArrayList<>();
             employees.add("John");
             employees.add("Ron");
             employees.add("Eileen");
              employees.add("Angy");
              employees.add("Alex");
              employees.add(" 13 ");
              employees.add("Tom");
            int i;
            for ( i =0 ; i < employees.size();i++) {

                System.out.println(employees.get(i));
            }
            employees.remove(5);
        System.out.println(employees);
            employees.add(5,"Ema");
        Iterator newEmployees = employees.iterator();
       while (newEmployees.hasNext()) {
           System.out.println(newEmployees.next());
       }

    }
}