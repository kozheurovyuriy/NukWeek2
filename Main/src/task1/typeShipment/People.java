package task1.typeShipment;

import static task1.typeShipment.EnumTypeShipment.PEOPLE;

public class People implements Shipmentable {

    private int weight;
    private int amount;
    private EnumTypeShipment enumTypeShipment = PEOPLE;

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
        return 0;
    }

    @Override
    public void setWeight(int weight) {
        weight = 0;
    }

    @Override
    public EnumTypeShipment getTypeShipment() {
        return enumTypeShipment;
    }
}
