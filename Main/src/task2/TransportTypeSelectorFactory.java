package task2;

import java.util.Set;

import static task2.Lines.RAILWAY;
import static task2.Lines.ROAD;

public class TransportTypeSelectorFactory {

    private CommunicationLines communicationLines;

    public TransportTypeSelectorFactory(Lines ... lines) {
        communicationLines = new CommunicationLines();
        for(Lines l: lines)
            communicationLines.addLine(l);
    }

    public PassengerCarrier getTransportByDistance(int requiredDistanse){

        Set<Lines> lines = communicationLines.getLines();

        if(lines.contains(ROAD) && requiredDistanse < 200)
            return new Car();
        else if(!lines.contains(ROAD) && lines.contains(RAILWAY) && requiredDistanse < 200)
            return new Train();
        else if(!lines.contains(ROAD) && !lines.contains(RAILWAY) && requiredDistanse < 200)
            return new Plane();
        else if(lines.contains(RAILWAY) && requiredDistanse > 200 && requiredDistanse < 1000)
            return new Train();
        else if(!lines.contains(RAILWAY) && requiredDistanse > 200 && requiredDistanse < 1000)
            return new Plane();
        else
            return new Plane();
    }

}
