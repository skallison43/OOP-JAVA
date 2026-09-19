package practice_JavaOOP.task2;

public class Dog extends Pet implements Walkable{
    @Override
    void eat() {
        System.out.println("ест сухой корм");
    }

    @Override
    public void walk() {
        System.out.println("гуляет");
    }
}
