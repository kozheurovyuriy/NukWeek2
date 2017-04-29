package task4;

/*
Создать суперкласс Музыкальный инструмент и классы Ударный, Струнный,
Духовой. Определить правила организации и управления оркестром.
 */

public class Main {

    public static void main(String[] args) {
        OrchestraFactory orchestraFactory = new OrchestraFactory();

        Instrument balalaika = orchestraFactory.getBalalaika();
        Instrument guitar = orchestraFactory.getGuitar();
        Instrument saxophone = orchestraFactory.getSaxophone();
        Instrument clarinet = orchestraFactory.getClarinet();
        Instrument drum = orchestraFactory.getDrum();

        System.out.print(balalaika.getName() + " make - ");
        orchestraFactory.makeMusic(balalaika);
        System.out.print(guitar.getName() + " make - ");
        orchestraFactory.makeMusic(guitar);
        System.out.print(saxophone.getName() + " make - ");
        orchestraFactory.makeMusic(saxophone);
        System.out.print(clarinet.getName() + " make - ");
        orchestraFactory.makeMusic(clarinet);
        System.out.print(drum.getName() + " make - ");
        orchestraFactory.makeMusic(drum);
    }
}
