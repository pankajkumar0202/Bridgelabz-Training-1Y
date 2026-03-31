class Device implements Runnable {
    String name;
    int time;

    public Device(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " working cycle " + i);
            try {
                Thread.sleep(time);
            } catch (Exception exp) {
            }
        }
    }
}

public class LifeCycleThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Device("Security Camera", 2500));
        Thread t2 = new Thread(new Device("Temperature Sensor", 4000));
        Thread t3 = new Thread(new Device("Light Controller", 3000));
        Thread t4 = new Thread(new Device("Door Lock", 5000));

        t1.setPriority(9);
        t2.setPriority(8);
        t3.setPriority(4);
        t4.setPriority(4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
