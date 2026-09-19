package practice_JavaOOP.task2;

public class Owner {
    private Pet pet;

    public void addPet(Pet pet){
        this.pet = pet;
        System.out.println("Домашний питомец " + this.pet + " был добавлен");
    }
    public void feed(){
        if (this.pet == null) {
            System.out.println("У хозяина нет питомца");
        }
        this.pet.eat();
        System.out.println("Домашнего питомца покормили");
    }
    public void forcePetToPlay(){
        if (this.pet == null) {
            System.out.println("У хозяина нет питомца");
        }
        if (this.pet instanceof Playable) {
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        } else {
            System.out.println("Домашний питомец не играет!");
        }
    }
    public void forcePetToWalk(){
        if (this.pet == null) {
            System.out.println("У хозяина нет питомца");
        }
        if (this.pet instanceof Walkable) {
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        } else {
            System.out.println("Домашний питомец не гуляет!");
        }
    }
    public void deletePet(){
        System.out.println("Домашний питомец был удален");
        this.pet = null;
    }
}
