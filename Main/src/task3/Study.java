package task3;

public class Study {

    private boolean isExtramuralStudies;
    private boolean isPossibleStudy;

    public Study(boolean isExtramuralStudies, boolean isPossibleStudy) {
        this.isExtramuralStudies = isExtramuralStudies;
        this.isPossibleStudy = isPossibleStudy;
    }

    public Study() {
    }

    public boolean isExtramuralStudies() {
        return isExtramuralStudies;
    }

    public void setExtramuralStudies(boolean extramuralStudies) {
        isExtramuralStudies = extramuralStudies;
    }

    public boolean isPossibleStudy() {
        return isPossibleStudy;
    }

    public void setPossibleStudy(boolean possibleStudy) {
        isPossibleStudy = possibleStudy;
    }
}
