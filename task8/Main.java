package practice_JavaOOP.task8;

public class Main {
    static void main(String[] args) {
        Museum museum = new Museum();

        Manuscript manuscript = new Manuscript();
        museum.setExhibit(manuscript);
        museum.showHistory();
        museum.preserveExhibit();
        museum.deleteExhibit();

        museum.preserveExhibit();

        Sculpture sculpture = new Sculpture();
        museum.setExhibit(sculpture);
        museum.showHistory();
        museum.preserveExhibit();
        museum.deleteExhibit();
    }
}
