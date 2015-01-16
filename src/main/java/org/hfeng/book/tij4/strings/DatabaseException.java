package org.hfeng.book.tij4.strings;

public class DatabaseException extends Exception {
    public DatabaseException(int transcationID, int queryID,
                             String message) {
        super(String.format("(t%d, q%d) %s", transcationID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                      //
// org.hfeng.book.tij4.strings.DatabaseException: (t3, q7) Write failed     //
/////////////////////////////////////////////////////////////////////////
