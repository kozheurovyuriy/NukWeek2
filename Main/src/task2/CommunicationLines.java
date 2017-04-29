package task2;

import java.util.HashSet;
import java.util.Set;

public class CommunicationLines {
    private Set<Lines> lines = new HashSet<>();

    public void addLine(Lines line){

        lines.add(line);
    }

    public Set<Lines> getLines() {
        return lines;
    }

    public void setLines(Set<Lines> lines) {
        this.lines = lines;
    }
}
