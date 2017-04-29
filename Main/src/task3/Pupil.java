package task3;

public class Pupil extends AbstractLearner {

    public Pupil(Study study, String name) {
        super(study, name);
    }

    @Override
    public String whoIs() {
        return "Pupil";
    }
}
