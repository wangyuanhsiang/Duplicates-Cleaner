/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicates.cleaner;

import java.util.ArrayList;

/**
 *
 * @author Shawn
 */
public class DuplicatesCleaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList();
        list.add(98765);
        list.add(357753);
        list.add(33357);
        list.add(98765);
        list.add(357753);
        list.add(33357);
        list.add(33357);
        list.add(357753);
        list.add(357753);
        list.add(33357);
        list.add(357753);
        
        for (Integer list1 : list) {

            System.out.println(list1);
        }

        try {

//            change duplicates to 0
            for (int x = 0; x < list.size(); x++) {
                int y = 1;
                y = y + x;
                for (; y <= list.size(); y++) {

                    if (y >= list.size()) {
                        break;
                    }
                    if (list.get(x).equals(list.get(y))) {
                        list.set(y, 0);
                    }
                }
            }

//            remove 0
            for (int z = 0; z < list.size(); z++) {
                if (list.get(z) == 0) {
                    list.remove(z);
                    z--;
                }

            }
        } catch (IndexOutOfBoundsException e) {

        }

        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("------------------------");
        for (Integer list1 : list) {

            System.out.println(list1);
        }

    }

}
