package practice_JavaOOP.task8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
        System.out.println("Экспонат " + this.exhibit + " был добавлен в музей");
    }
    public void showHistory(){
        if (this.exhibit == null){
            System.out.println("В музее нет экспоната");
            return;
        }
        this.exhibit.describe();
        System.out.println("История экспоната была представлена");
    }
    public void preserveExhibit(){
        if (this.exhibit == null){
            System.out.println("В музее нет экспоната");
            return;
        }
        this.exhibit.preserve();
        System.out.println("Необходимые условия хранения обеспечены");
    }
    public void deleteExhibit(){
        this.exhibit = null;
        System.out.println("Экспонат был удален");
    }
}
