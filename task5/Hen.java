package practice_JavaOOP.task5;

public class Hen extends DomesticAnimal{
    @Override
    void care() {
        System.out.println("Нуждается в зерне");
    }

    @Override
    void produce() {
        System.out.println("Несет яйца");
    }
}
