package practice_JavaOOP.task7;

public class Carousel extends Attraction{
    @Override
    void info() {
        System.out.println("Это музыкальный и спокойный атрракцион");
    }

    @Override
    void service() {
        System.out.println("Требует технического обслуживания");
    }
}
