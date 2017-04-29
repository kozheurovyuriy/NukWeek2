package task3;

/**
 * 3. Создать суперкласс Учащийся и подклассы Школьник и Студент. Определить способы
 * обучения и возможности его продолжения.
 */
public class Main {

    public static void main(String[] args) {


        StudyChecker studyChecker =
                new StudyChecker(
                        new Student(
                                new Study(true, true), "Yuriy"));
       studyChecker.printIsExtramuralStudies();
       studyChecker.printisPossibleStudy();
    }
}
