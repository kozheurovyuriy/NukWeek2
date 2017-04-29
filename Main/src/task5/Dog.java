package task5;

public class Dog implements Animal {
    @Override
    public String getTypeName() {
        return "Dog";
    }

    @Override
    public void makeVoice() {
        System.out.println("Bark");
    }
}
