package practice_JavaOOP.task3;

public class HotMeal extends Dish{
    private int temperature;

    public HotMeal(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    void showCharacteristic() {
        System.out.println("Температура блюда " + this.temperature);
    }
}
