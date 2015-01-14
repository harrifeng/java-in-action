package org.hfeng.misc.test;

class NameRunnable implements Runnable {
    public void run() {
        for (int x = 1; x <= 3; x++) {
            System.out.println("Run by " + Thread.currentThread().getName()
                               + ", x is " + x);
        }
    }
}

public class ManyNames {
    public static void main(String[] args) {
        // Make one Runnable
        NameRunnable nr = new NameRunnable();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");
        one.start();
        two.start();
        three.start();
    }
}

/////////////////////////////////////////////////////////////
// <===================POSSIBLE OUTPUT===================> //
// Run by Lucy, x is 1                                     //
// Run by Ricky, x is 1                                    //
// Run by Fred, x is 1                                     //
// Run by Ricky, x is 2                                    //
// Run by Lucy, x is 2                                     //
// Run by Ricky, x is 3                                    //
// Run by Fred, x is 2                                     //
// Run by Fred, x is 3                                     //
// Run by Lucy, x is 3                                     //
/////////////////////////////////////////////////////////////
