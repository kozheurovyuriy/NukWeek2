package task5;

public class Tiger implements Animal {
    @Override
    public String getTypeName() {
        return "Tiger";
    }

    @Override
    public void makeVoice() {
        System.out.println("Rrrrrrr");
    }
}
