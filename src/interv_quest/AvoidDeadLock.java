package interv_quest;

public class AvoidDeadLock {

    public void method1() {
        synchronized (Integer.class) {
            System.out.println("Acquired lock on string.class object");

            synchronized (String.class) {
                System.out.println("Acquired lock on Integer.class object");
            }
        }
    }

    /*
    * This method also requests same two lock but in exactly
    * Opposite order i.e. first Integer and then String
    * This creates potential deadlock, if one thread holds String lock
    * and othe holds Integer lock and they wait dor each other, forever
    * */
    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Acquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Acquired lock on String.class object");
            }
        }
    }
}
