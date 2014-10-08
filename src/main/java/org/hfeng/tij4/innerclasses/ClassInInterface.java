package org.hfeng.tij4.innerclasses;

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Howdy!");
        }
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                                              //
// mvn exec:java -Dexec.mainClass="org.hfeng.tij4.innerclasses.ClassInInterface$Test"          //
// [INFO] Scanning for projects...                                                             //
// [INFO]                                                                                      //
// [INFO] ------------------------------------------------------------------------             //
// [INFO] Building java-in-action 1.0-SNAPSHOT                                                 //
// [INFO] ------------------------------------------------------------------------             //
// [INFO]                                                                                      //
// [INFO] --- exec-maven-plugin:1.3.2:java (default-cli) @ java-in-action ---                  //
// [WARNING] Warning: killAfter is now deprecated. Do you need it ? Please comment on MEXEC-6. //
// Howdy!                                                                                      //
// [INFO] ------------------------------------------------------------------------             //
// [INFO] BUILD SUCCESS                                                                        //
// [INFO] ------------------------------------------------------------------------             //
// [INFO] Total time: 0.470s                                                                   //
// [INFO] Finished at: Wed Oct 08 22:33:52 CST 2014                                            //
// [INFO] Final Memory: 7M/18M                                                                 //
// [INFO] ------------------------------------------------------------------------             //
/////////////////////////////////////////////////////////////////////////////////////////////////
