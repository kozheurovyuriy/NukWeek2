package task3;

public class StudyChecker {

    private AbstractLearner learner;

    public StudyChecker(AbstractLearner learner) {
        this.learner = learner;
    }

    public void printIsExtramuralStudies(){
        if(learner.getStudy().isExtramuralStudies())
            System.out.println(learner.whoIs() + " " + learner.getName() + " has Extramural Studies");
        else
            System.out.println(learner.whoIs() + " " + learner.getName() + " has Full time Studies");
    }

    public void printisPossibleStudy(){
        if(learner.getStudy().isPossibleStudy())
            System.out.println(learner.whoIs() + " " + learner.getName() + " is possible to study");
        else
            System.out.println(learner.whoIs() + " " + learner.getName() + " impossible to study");
    }
}
