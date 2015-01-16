package org.hfeng.book.tij4.reusing;

public class Lisa extends Homer {

    //////////////////////////////////////////////////
    // //! NOT work, it is overload, not override   //
    // @Override                                    //
    // void doh(Milhouse m) {                       //
    //     System.out.println("@Override failed!"); //
    // }                                            //
    //////////////////////////////////////////////////

    @Override
    float doh(float f) {
        System.out.println("@Override works!");
        return 1.0f;
    }
}
