package atm;

public class ATM {
    private Tray tray;
    public ATM() {
        Tray tray100 = new Tray100UAH();
        Tray tray20 = new Tray20UAH();
        Tray tray5 = new Tray5UAH();
        Tray tray1 = new Tray1UAH();

        tray100.setNext(tray20);
        tray20.setNext(tray5);
        tray5.setNext(tray1);
        tray = tray100;
    }
    public void process(int amount) {
        tray.process(amount);
    }
}
