package task1.transport;

import task1.typeShipment.Shipmentable;

public abstract class AbstractTransport {

    private int speed;
    private int priceForOneKm;

    public AbstractTransport(int speed, int priceForOneKm) {
        this.speed = speed;
        this.priceForOneKm = priceForOneKm;
    }

    public abstract int calculateShippingPrice(int distanse, Shipmentable shipmentable);

    public double calculateShippingTime(double distanse){
        return distanse / speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPriceForOneKm() {
        return priceForOneKm;
    }

    public void setPriceForOneKm(int priceForOneKm) {
        this.priceForOneKm = priceForOneKm;
    }
}
