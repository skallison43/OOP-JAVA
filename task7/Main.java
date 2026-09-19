package practice_JavaOOP.task7;

public class Main {
    static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();

        Carousel carousel = new Carousel();
        amusementPark.setAttraction(carousel);
        amusementPark.showInfo();
        amusementPark.serviceAttraction();
        amusementPark.deleteAttraction();

        amusementPark.showInfo();

        RollerCoaster rollerCoaster = new RollerCoaster();
        amusementPark.setAttraction(rollerCoaster);
        amusementPark.showInfo();
        amusementPark.serviceAttraction();
    }
}
