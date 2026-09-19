package practice_JavaOOP.task6;

public class Main {
    static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        Cactus cactus1 = new Cactus();

        botanicalGarden.setPlant(cactus1);
        botanicalGarden.takeCare();
        botanicalGarden.deletePlant();

        botanicalGarden.takeCare();

        Orchid orchid1 = new Orchid();
        botanicalGarden.setPlant(orchid1);
        botanicalGarden.takeCare();
        botanicalGarden.deletePlant();
    }
}
