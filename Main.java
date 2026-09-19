package practice_JavaOOP.task1;

public class Main {
    static void main(String[] args) {
        Zoo zoo = new Zoo();

        Elephant elle = new Elephant();

        zoo.addAnimal(elle);
        zoo.forceMakeMove();
        zoo.forceMakeSound();
        zoo.deleteAnimal();

        Bird sparrow = new Bird();
        zoo.addAnimal(sparrow);
        zoo.forceMakeSound();
        zoo.forceMakeMove();
    }
}
