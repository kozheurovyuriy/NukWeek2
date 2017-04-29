package task2;

import task2.transport.PassengerCarrier;

import static task2.lines.Lines.RAILWAY;
import static task2.lines.Lines.ROAD;

public class Main {
    /*
    2. Создать суперкласс Пассажироперевозчик и подклассы Самолет, Поезд, Автомобиль.
Задать правила выбора транспорта в зависимости от расстояния и наличия путей
сообщения.
     */

    public static void main(String[] args) {

        int requiredDistanse = 450;

        TransportTypeFactorySelector transportTypeSelector = new TransportTypeFactorySelector(ROAD, RAILWAY);

        PassengerCarrier transportByDistance =
                transportTypeSelector.getTransportByDistance(requiredDistanse);

        System.out.println("Required transport for you is - " + transportByDistance.getTypeTransportName());

    }
}
