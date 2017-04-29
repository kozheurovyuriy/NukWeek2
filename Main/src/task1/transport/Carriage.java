package task1.transport;

import task1.typeShipment.Shipmentable;

public class Carriage extends AbstractTransport {


    public Carriage(int speed, int priceForOneKm) {
        super(speed, priceForOneKm);
    }

    @Override
    public int calculateShippingPrice(int distanse, Shipmentable shipmentable) {

        switch (shipmentable.getTypeShipment()) {
            case PEOPLE:
                return distanse * getPriceForOneKm() * shipmentable.getAmount();
            case CARGO:
                return distanse < 100 ? 100 : distanse + shipmentable.getWeight();
            default:
                return -1;
        }
    }
}
