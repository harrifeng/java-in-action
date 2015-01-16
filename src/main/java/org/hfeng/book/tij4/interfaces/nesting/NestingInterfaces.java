package org.hfeng.book.tij4.interfaces.nesting;

class A {
    interface B {
        void f();
    }
    public class BImp implements B {
        public  void f() {}
    }
    public class BImp2 implements B  {
        public void f() {}
    }
    public interface C {
        void f();
    }
    class CImp implements  C {
        public void f() {}
    }
    private class CImp2 implements C {
        public void f() {}
    }
    private interface D {
        void f();
    }
    private class DImpl implements D {
        public void f() {}
    }
    public class DImpl2 implements D {
        public void f() {}
    }
    public D getD() {
        return new DImpl2();
    }
    private D dRdf;
    public void receiveD(D d) {
        dRdf = d;
        dRdf.f();
    }
}

interface E {
    interface G {
        void f();
    }
    // Redundant "public"
    public interface H {
        void f();
    }
    void g();
    // Can nt be private within an interface:
    //! private inferface I {}
}
public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {}
    }

    class CImp implements A.C {
        public void f() {}
    }
    // Cannot implement a private interface except
    // within that interface's defining class:
    //! class DImpl implements A.D {
    //!    public void f() {}
    //! }
    class EImp implements E {
        public void g() {}
    }
    class EGImp implements E.G {
        public void f() {}
    }
    class EImp2 implements E {
        public void g() {}
        class EG implements E.G {
            public void f() {}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        // Can't access A.D
        //! A.D ad = a.getD();
        // Doesn't return anything but A.D
        //! A.DImpl2 di2 = a.getD();
        // Cannot access a member of the interface
        //! a.gtD().f();
        // Only another A can do anything with getD():
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
