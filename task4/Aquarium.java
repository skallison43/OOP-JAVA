package practice_JavaOOP.task4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void setSeaCreature(SeaCreature seaCreature){
        this.seaCreature = seaCreature;
        System.out.println("Морское существо " + this.seaCreature + " было добавлено в аквариум");
    }
    public void makeMove(){
        if (this.seaCreature == null){
            System.out.println("В аквариуме нет морских существ");
            return;
        }
        this.seaCreature.move();
    }
    public void deleteSeaCreature(){
        System.out.println("Морское существо " + this.seaCreature + " было удалено из аквариума");
        this.seaCreature = null;
    }
}
