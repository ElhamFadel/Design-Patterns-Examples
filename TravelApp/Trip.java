package TravelApp;

public abstract class Trip {
    public abstract void doComingTransport();
    public abstract void doDayA();
    public abstract void doDayB();
    public abstract void doDayC();
    public abstract void doLeavingTransport();
    final public void performTrip() {
        doComingTransport();
        doDayA();
        doDayB();
        doDayC();
        doLeavingTransport();
    }
    
}
