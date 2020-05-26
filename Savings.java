public class Savings extends Account {
    // List properties specific toa savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxCode;

    // Constructor to initialize savings account properties
    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
        // System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        // System.out.println("New Savings Account");

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxCode = (int) (Math.random() * Math.pow(10, 4));

    }

    // List any methods specific to the savings account

    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("Your Savings Account Features" + "\n Safety Deposit Box ID " + safetyDepositBoxID
                + "\n Safety Deposit Box Code " + safetyDepositBoxCode);
    }

}