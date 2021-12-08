package atm;

public class DefaultTray implements Tray{
    private int bill;
    private Tray nextTray;
    public DefaultTray(int bill) {
        this.bill = bill;
    }

    @Override
    public void process(int amount) {
        if (nextTray != null) {
            nextTray.process(amount % bill);
        } else if (amount % bill > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("extracted " + amount/bill + " with amount of " + bill);
    }

    @Override
    public void setNext(Tray tray) {
        this.nextTray = tray;
    }
}
