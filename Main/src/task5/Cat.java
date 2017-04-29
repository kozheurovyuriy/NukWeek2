package task5;

public class Cat implements Animal {
    @Override
    public String getTypeName() {
        return "Cat";
    }

    @Override
    public void makeVoice() {
        System.out.println("Miuuu");
    }
}
