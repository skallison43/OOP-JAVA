package practice_JavaOOP.task3;

public class Restaurant {
    private Dish dish;

    public void addDish(Dish dish){
        this.dish = dish;
        System.out.println("Блюдо " + this.dish + " было добавлено в ресторанное меню");
    }
    public void showCharacteristics(){
        if (this.dish == null) {
            System.out.println("Блюдо не добавлено");
            return;
        }
        this.dish.showCharacteristic();
        System.out.println("Характеристики блюда были показаны");
    }
    public void deleteDish(){
        this.dish = null;
    }
}
