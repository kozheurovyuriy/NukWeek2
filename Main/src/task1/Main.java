package task1;

import task1.transport.AbstractTransport;
import task1.transport.Car;
import task1.typeShipment.People;
import task1.typeShipment.Shipmentable;

/**
 * 1. Создать суперкласс Транспортное средство и подклассы Автомобиль, Велосипед,
 * Повозка. Подсчитать время и стоимость перевозки пассажиров и грузов каждым
 * транспортным средством.
 */

public class Main {

    public static void main(String[] args) {

        Shipmentable family = new People();
        family.setAmount(3);

        AbstractTransport bmv = new Car(130, 3);
        System.out.println("Time for trip is - " + bmv.calculateShippingTime(360) + " hours");
        System.out.println("Price for trip is - " + bmv.calculateShippingPrice(360, family));
    }
}
