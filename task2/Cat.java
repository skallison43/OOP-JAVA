package practice_JavaOOP.task2;

public class Cat extends Pet implements Playable{
    @Override
    void eat() {
        System.out.println("ест влажный корм");
    }

    @Override
    public void play() {
        System.out.println("играет");
    }
}
