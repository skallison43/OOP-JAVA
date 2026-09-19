package practice_JavaOOP.task3;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    void showCharacteristic() {
        System.out.println("Объем напитка " + this.volume);
    }
}
