package task4;

public class Percussion extends Instrument {

    public Percussion(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("BAM");
    }
}
