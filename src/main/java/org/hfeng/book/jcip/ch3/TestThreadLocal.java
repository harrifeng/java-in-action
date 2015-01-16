package org.hfeng.book.jcip.ch3;

class Connection {
    private String url;

    Connection(String url) {
        this.url = url;
    }
}

class DriverManager {

    public static Connection getConnection(String db_url) {
        return new Connection(db_url);
    }
}

public class TestThreadLocal {
    public static final String DB_URL = "jdbc:mysql://localhost/mydatabase";

    private ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {
        public Connection initialValue() {
            return DriverManager.getConnection(DB_URL);
        }
    };

    private class Thread1 extends Thread {
        public void run() {
            System.out.println("Connection is " + connectionHolder.get());
        }
    }

    private class Thread2 extends Thread {
        public void run() {
            System.out.println("Connection is " + connectionHolder.get());
        }
    }

    public void display() {
        new Thread1().start();
        new Thread2().start();
    }

    public static void main(String[] args) {
        TestThreadLocal testThreadLocal = new TestThreadLocal();
        testThreadLocal.display();
    }
}

////////////////////////////////////////////////////////
// <===================OUTPUT===================>     //
// Connection is org.hfeng.book.jcip.ch3.Connection@fe268a //
// Connection is org.hfeng.book.jcip.ch3.Connection@52b16b //
////////////////////////////////////////////////////////
