package practice_JavaOOP.task1;

public class Bird extends Animal{
    @Override
    void makeSound() {
        System.out.println("Чирикает");
    }

    @Override
    void makeMove() {
        System.out.println("Летает");
    }
}
