package practice;

public class ConsPractice {
    String carName;
    int makeYear;

    public ConsPractice(String name, int year){
        this.carName = name;
        this.makeYear = year;

        System.out.println("Car name is :" + name );
        System.out.println("Car make is :" + year );
    }

    public static void main(String[] args) {
        ConsPractice car1 = new ConsPractice("Toyota", 1997);
        ConsPractice car2 = new ConsPractice("Honda", 2019);
        ConsPractice car3 = new ConsPractice("BMW", 2022);
        ConsPractice car4 = new ConsPractice("Tesla", 2024);
    }
}
