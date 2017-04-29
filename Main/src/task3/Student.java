package task3;

public class Student extends AbstractLearner {

    public Student(Study study, String name) {
        super(study, name);
    }

    @Override
    public String whoIs() {
        return "Student";
    }
}
