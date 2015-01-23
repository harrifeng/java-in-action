package org.hfeng.book.jcip.ch5;

public class InterruptOthers {
    final Thread subject1 = new Thread(new Runnable() {
        public void run() {
            while (!Thread.interrupted()) {
                Thread.yield();
            }
            System.out.println("subject 1 stopped!");
        }
    });

    final Thread subject2 = new Thread(new Runnable() {
        public void run() {
            while (!Thread.interrupted()) {
                Thread.yield();
            }
            System.out.println("subject 2 stopped!");
        }
    });

    final Thread coordinator = new Thread(new Runnable() {
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException exe) {

            }
            System.out.println("coordinator stopping!");
            subject1.interrupt();
            subject2.interrupt();
        }
    });

    public static void main(String[] args) {
        InterruptOthers interruptOthers = new InterruptOthers();
        interruptOthers.subject1.start();
        interruptOthers.subject2.start();
        interruptOthers.coordinator.start();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// coordinator stopping!                          //
// subject 1 stopped!                             //
// subject 2 stopped!                             //
////////////////////////////////////////////////////
