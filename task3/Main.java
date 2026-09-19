package practice_JavaOOP.task3;

public class Main {
    static void main(String[] args) {
        Restaurant rest = new Restaurant();

        HotMeal pasta = new HotMeal(80);
        rest.addDish(pasta);
        rest.showCharacteristics();
        rest.deleteDish();

        rest.showCharacteristics();

        Drink lemonade = new Drink(300);
        rest.addDish(lemonade);
        rest.showCharacteristics();
    }
}
