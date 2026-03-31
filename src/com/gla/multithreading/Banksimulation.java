class BankAccount implements Runnable {
    private String accountHolder;
    private String accountType;
    public BankAccount(String accountHolder, String accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    accountHolder + " (" + accountType + ") is checking balance | Priority: "
                    + Thread.currentThread().getPriority()
                );

                Thread.sleep(2000); // simulate 2 sec delay
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Banksimulation {
    public static void main(String[] args) {
        BankAccount premiumUser = new BankAccount("Pankaj", "Premium");
        BankAccount regularUser = new BankAccount("Naveen", "Regular");
        BankAccount basicUser = new BankAccount("Naman", "Basic");
        Thread t1 = new Thread(premiumUser);
        Thread t2 = new Thread(regularUser);
        Thread t3 = new Thread(basicUser);
        t1.setPriority(10); // Premium
        t2.setPriority(5);  // Regular
        t3.setPriority(1);  // Basic
        t1.start();
        t2.start();
        t3.start();
    }
}
