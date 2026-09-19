package practice_JavaOOP.task1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal){
        this.animal = animal;
        System.out.println("Животное " + this.animal + " было добавлено в зоопарк");
    }
    public void forceMakeSound(){
        this.animal.makeSound();
    }
    public void forceMakeMove(){
        this.animal.makeMove();
    }
    public void deleteAnimal(){
        System.out.println("Животное " + this.animal + " было удалено из зоопарка");
        this.animal = null;
    }
}
