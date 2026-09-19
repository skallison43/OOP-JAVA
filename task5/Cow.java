package practice_JavaOOP.task5;

public class Cow extends DomesticAnimal{
    @Override
    void care() {
        System.out.println("Нуждается в выпасе");
    }

    @Override
    void produce() {
        System.out.println("Дает молоко");
    }
}
