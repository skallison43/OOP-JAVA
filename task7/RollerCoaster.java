package practice_JavaOOP.task7;

public class RollerCoaster extends Attraction{
    @Override
    void info() {
        System.out.println("Это веселый атрракцион для самых смелых");
    }

    @Override
    void service() {
        System.out.println("Требует проверки безопасности");
    }
}
