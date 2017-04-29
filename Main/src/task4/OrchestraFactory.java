package task4;

public class OrchestraFactory {

    private Instrument guitar;
    private Instrument balalaika;
    private Instrument saxophone;
    private Instrument clarinet;
    private Instrument drum;

    public OrchestraFactory() {
        guitar = new Stringed("guitar");
        balalaika = new Stringed("balalaika");
        saxophone = new Breathing("saxophone");
        clarinet = new Breathing("clarinet");
        drum = new Percussion("drum");
    }

    public void makeMusic(Instrument instrument){
        instrument.play();
    }

    public Instrument getGuitar() {
        return guitar;
    }

    public Instrument getBalalaika() {
        return balalaika;
    }

    public Instrument getSaxophone() {
        return saxophone;
    }

    public Instrument getClarinet() {
        return clarinet;
    }

    public Instrument getDrum() {
        return drum;
    }
}
