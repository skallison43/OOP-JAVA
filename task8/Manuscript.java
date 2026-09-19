package practice_JavaOOP.task8;

public class Manuscript extends Exhibit{
    @Override
    void describe() {
        System.out.println("Это древний текст");
    }

    @Override
    void preserve() {
        System.out.println("Требует контролируемой влажности");
    }
}
