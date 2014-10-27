package org.hfeng.tij4.innerclasses;

public class Parcel8 {
   public Wrapping wrapping(int x) {
       // Base ctor call:
       return new Wrapping(x) { // Pass ctor argument
           public int value() {
               return super.value() * 47;
           }
       };
   }

   public static void main(String[] args) {
       Parcel8 p = new Parcel8();
       Wrapping w = p.wrapping(10);
   }
}
