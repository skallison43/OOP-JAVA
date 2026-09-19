package practice_JavaOOP.task5;

public class Farm {
    private DomesticAnimal domesticAnimal;

    public void setDomesticAnimal(DomesticAnimal domesticAnimal) {
        this.domesticAnimal = domesticAnimal;
        System.out.println("Домашнее животное " + this.domesticAnimal + " было добавлено на ферму");
    }
    public void takeCare(){
        if (domesticAnimal == null){
            System.out.println("На ферме нет домашних животных");
            return;
        }
        this.domesticAnimal.care();
    }
    public void makeProfit(){
        if (domesticAnimal == null){
            System.out.println("На ферме нет домашних животных");
            return;
        }
        this.domesticAnimal.produce();
    }
    public void deleteDomesticAnimal(){
        System.out.println("Домашнее животное " + this.domesticAnimal + " было удалено с фермы");
        this.domesticAnimal = null;
    }
}
