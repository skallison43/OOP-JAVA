package practice_JavaOOP.task2;

public class Main {
    static void main(String[] args) {
        Owner owner = new Owner();

        Dog rex = new Dog();
        owner.addPet(rex);
        owner.feed();
        owner.forcePetToPlay();
        owner.forcePetToWalk();
        owner.deletePet();

        owner.addPet(new Cat());
        owner.feed();
        owner.forcePetToWalk();
        owner.forcePetToPlay();

    }
}
