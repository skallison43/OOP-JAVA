package practice_JavaOOP.task6;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Растение " + this.plant + " было добавлено в ботанический сад");
    }
    public void takeCare(){
        if (this.plant == null){
            System.out.println("В саду нет никаких растений");
            return;
        }
        this.plant.care();
    }
    public void deletePlant(){
        System.out.println("Растение " + this.plant + " было удалено из ботанического сада");
        this.plant = null;
    }
}
