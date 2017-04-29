package task1.typeShipment;

import static task1.typeShipment.EnumTypeShipment.CARGO;

public class Cargo implements Shipmentable {

    private int weight;
    private int amount;
    private EnumTypeShipment enumTypeShipment = CARGO;


    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public EnumTypeShipment getTypeShipment() {
        return enumTypeShipment;
    }
}
