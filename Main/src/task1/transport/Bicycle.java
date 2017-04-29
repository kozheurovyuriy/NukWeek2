package task1.transport;

import task1.typeShipment.Shipmentable;

public class Bicycle extends AbstractTransport {


    public Bicycle(int speed, int priceForOneKm) {
        super(speed, priceForOneKm);
    }

    @Override
    public int calculateShippingPrice(int distanse, Shipmentable shipmentable) {

        switch (shipmentable.getTypeShipment()) {
            case PEOPLE:
                return distanse * getPriceForOneKm();
            case CARGO:
                return distanse < 10 ? 100 : distanse;
            default:
                return -1;
        }
    }
}
