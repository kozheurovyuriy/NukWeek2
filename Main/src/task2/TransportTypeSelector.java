package task2;

public class TransportTypeSelector {

    public PassengerCarrier getTransportByDistance(int requiredDistanse){
        if(requiredDistanse < 200)
            return new Car();
        else if(requiredDistanse < 1000 && requiredDistanse > 200)
            return new Train();
        else
            return new Plane();
    }

}
