package task1.transport;

import task1.typeShipment.Shipmentable;

public class Car extends AbstractTransport {


    public Car(int speed, int priceForOneKm) {
        super(speed, priceForOneKm);
    }

    @Override
    public int calculateShippingPrice(int distanse, Shipmentable shipmentable) {

        switch (shipmentable.getTypeShipment()) {
            case PEOPLE:
                return distanse * getPriceForOneKm() * shipmentable.getAmount();
            case CARGO:
                return distanse + (shipmentable.getWeight() * shipmentable.getAmount());
            default:
                return -1;
        }
    }
}
