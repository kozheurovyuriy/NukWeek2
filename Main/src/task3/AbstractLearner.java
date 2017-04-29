package task3;

public abstract class AbstractLearner {

    private Study study;
    private String name;

    public AbstractLearner(Study study, String name) {
        this.study = study;
        this.name = name;
    }

    public abstract String whoIs();

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
