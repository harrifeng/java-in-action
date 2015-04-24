package org.hfeng.misc.hfdp.ch8.template.sort;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 1),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huy", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}

///////////////////////////////////////////////////////
// <===================OUTPUT===================>    //
// Before sorting:                                   //
// Daffy weights     	8                            //
// Dewey weights     	1                            //
// Howard weights     	7                            //
// Louie weights     	2                            //
// Donald weights     	10                           //
// Huy weights     	2                                //
//                                                   //
// After sorting:                                    //
// Dewey weights     	1                            //
// Louie weights     	2                            //
// Huy weights     	2                                //
// Howard weights     	7                            //
// Daffy weights     	8                            //
// Donald weights     	10                           //
///////////////////////////////////////////////////////
