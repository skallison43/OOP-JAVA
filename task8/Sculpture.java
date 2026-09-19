package practice_JavaOOP.task8;

public class Sculpture extends Exhibit{
    @Override
    void describe() {
        System.out.println("Это исторический памятник");
    }

    @Override
    void preserve() {
        System.out.println("Нуждается в реставрации");
    }
}
