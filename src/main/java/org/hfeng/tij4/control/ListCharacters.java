package org.hfeng.tij4.control;

public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                System.out.println("value:" + (int)c + "character: " + c);
            }
        }
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// value:97character: a                           //
// value:98character: b                           //
// value:99character: c                           //
// value:100character: d                          //
// value:101character: e                          //
// value:102character: f                          //
// value:103character: g                          //
// value:104character: h                          //
// value:105character: i                          //
// value:106character: j                          //
// value:107character: k                          //
// value:108character: l                          //
// value:109character: m                          //
// value:110character: n                          //
// value:111character: o                          //
// value:112character: p                          //
// value:113character: q                          //
// value:114character: r                          //
// value:115character: s                          //
// value:116character: t                          //
// value:117character: u                          //
// value:118character: v                          //
// value:119character: w                          //
// value:120character: x                          //
// value:121character: y                          //
// value:122character: z                          //
////////////////////////////////////////////////////
