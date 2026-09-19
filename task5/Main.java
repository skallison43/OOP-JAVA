package practice_JavaOOP.task5;

public class Main {
    static void main(String[] args) {
        Farm farm = new Farm();

        Hen hen1 = new Hen();
        farm.setDomesticAnimal(hen1);
        farm.takeCare();
        farm.makeProfit();
        farm.deleteDomesticAnimal();

        Cow cow1 = new Cow();
        farm.setDomesticAnimal(cow1);
        farm.takeCare();
        farm.makeProfit();
        farm.deleteDomesticAnimal();

        farm.makeProfit();
    }
}
