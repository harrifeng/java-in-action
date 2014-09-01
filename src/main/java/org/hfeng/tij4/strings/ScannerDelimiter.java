package org.hfeng.tij4.strings;

import java.util.*;

public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// 12                                             //
// 42                                             //
// 78                                             //
// 99                                             //
// 42                                             //
////////////////////////////////////////////////////

