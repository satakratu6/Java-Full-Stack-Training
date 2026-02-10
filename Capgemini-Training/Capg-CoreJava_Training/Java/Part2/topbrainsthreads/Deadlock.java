public class Deadlock {

    private static final Object PEN = new Object();
    private static final Object PAPER = new Object();

    static class TaskMartin extends Thread {
        public void run() {
            synchronized (PEN) {
                System.out.println("Martin using Pen waiting for Paper");
                try { Thread.sleep(200); } catch (Exception e) {}
                synchronized (PAPER) {
                }
            }
        }
    }

    static class TaskDavid extends Thread {
        public void run() {
            try { Thread.sleep(50); } catch (Exception e) {}
            synchronized (PAPER) {
                System.out.println("David using Paper waiting for Pen");
                try { Thread.sleep(200); } catch (Exception e) {}
                synchronized (PEN) {
                }
            }
        }
    }

    static class MartinResolved extends Thread {
        public void run() {
            synchronized (PEN) {
                System.out.println("Martin picked Pen");
                synchronized (PAPER) {
                    System.out.println("Martin picked Paper");
                }
            }
        }
    }

    static class DavidResolved extends Thread {
        public void run() {
            synchronized (PEN) {
                System.out.println("David picked Pen");
                synchronized (PAPER) {
                    System.out.println("David picked Paper");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Thread martin = new TaskMartin();
        Thread david = new TaskDavid();

        martin.start();
        david.start();

        martin.join(500);
        david.join(500);

        System.out.println();
        System.out.println("Resolving Deadlock...");
        System.out.println();

        Thread m2 = new MartinResolved();
        Thread d2 = new DavidResolved();

        m2.start();
        m2.join();

        d2.start();
        d2.join();
    }
}
