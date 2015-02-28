package org.hfeng.book.dpj.ch7.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new TextBuilder());
        String result = (String)director.construct();
        System.out.println(result);
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// ========================                       //
// [Greeting]                                     //
//                                                //
// #From morning to night                         //
//                                                //
// .Good Morning                                  //
// .Good Noon                                     //
//                                                //
// #Night now                                     //
//                                                //
// .Good Night                                    //
// .Have a good dream                             //
// .Goodbye!                                      //
//                                                //
// ========================                       //
////////////////////////////////////////////////////
