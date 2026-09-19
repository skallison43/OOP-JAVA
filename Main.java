package practice_JavaOOP.task4;

public class Main {
    static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Starfish starfish = new Starfish();
        aquarium.setSeaCreature(starfish);
        aquarium.makeMove();
        aquarium.deleteSeaCreature();

        Shark shark1 = new Shark();
        aquarium.setSeaCreature(shark1);
        aquarium.makeMove();
        aquarium.deleteSeaCreature();
    }
}
