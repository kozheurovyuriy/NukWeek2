package task5;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.print(cat.getTypeName() + " make - ");
        cat.makeVoice();
    }
}
