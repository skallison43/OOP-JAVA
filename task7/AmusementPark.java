package practice_JavaOOP.task7;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Атрракцион " + this.attraction + " был добавлен в парк развлечений");
    }
    public void showInfo(){
        if (this.attraction == null) {
            System.out.println("Аттракцион отсутствует в парке развлечений");
            return;
        }
        this.attraction.info();
        System.out.println("Описание аттракциона предоставлено");
    }
    public void serviceAttraction(){
        if (this.attraction == null) {
            System.out.println("Аттракцион отсутствует в парке развлечений");
            return;
        }
        this.attraction.service();
        System.out.println("Необходимые меры по обслуживанию предоставлены");
    }
    public void deleteAttraction(){
        this.attraction = null;
        System.out.println("Аттракцион был удален");
    }
}
