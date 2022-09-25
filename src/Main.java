import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Cat murzic = new Cat("Мурзик");
        murzic.age = 3;
        murzic.meow();

        Cat begemot = new Cat("Бегемот", -5);
        begemot.meow();

        Human human = new Human();
        human.name = "Максим";
        human.town = "Минск";
        human.yearOfBurth = 1987;
        human.job = "бренд-менеджер";

        Human human1 = new Human();
        human1.name = "Аня";
        human1.town = "Москва";
        human1.yearOfBurth = 1993;
        human1.job = "методист образовательных программ";

        Human human2 = new Human();
        human2.name = "Катя";
        human2.town = "Калинанград";
        human2.yearOfBurth = 1994;
        human2.job = "продакт-менеджер";

        Human human3 = new Human();
        human3.name = "Артем";
        human3.town = "Москва";
        human3.yearOfBurth = 1995;
        human3.job = "директор по развитию бизнеса";

        human.Welcome();
        human1.Welcome();
        human2.Welcome();
        human3.Welcome();

        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Grande";
        lada.engineVolume = 1.7f;
        lada.color = "yellow";
        lada.productionYear = 2015;
        lada.productionCountry = "Russia";

        System.out.println();

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0f;
        audi.color = "black";
        audi.productionYear = 2020;
        audi.productionCountry = "Germany";

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0f;
        bmw.color = "black";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Germany";

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4 поколение";
        kia.engineVolume = 3.0f;
        kia.color = "red";
        kia.productionYear = 2018;
        kia.productionCountry = "South Korea";

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 3.0f;
        hyundai.color = "orange";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "South Korea";

        lada.printInformation();
        audi.printInformation();
        bmw.printInformation();
        kia.printInformation();
        hyundai.printInformation();
        System.out.println();

        Human max = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human kate = new Human("Катя", "Калининград", 1994, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        max.Welcome();
        anya.Welcome();
        kate.Welcome();
        artem.Welcome();
        System.out.println();

        Car lada1 = new Car("Lada", "Grande", 1.7f, "yellow", 2015, "Russia");
        Car audi1 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "black", 2020, "Germany");
        Car bmw1 = new Car("BMW", "Z8", 3.0f, "black", 2021, "Germany");
        Car kia1 = new Car("Kia", "Sportage 4 поколение", 2.4f, "red", 2018, "South Korea");
        Car hyundai1 = new Car("Hyundai", "Avante", 1.6f, "orange", 2016, "South Korea");

        lada1.printInformation();
        audi1.printInformation();
        bmw1.printInformation();
        kia1.printInformation();
        hyundai1.printInformation();
        System.out.println();

        System.out.println("У кота " + murzic.name + " " + murzic.friends.length + " друзей");
        murzic.addFriend(begemot);
        System.out.println("У кота " + murzic.name + " " + murzic.friends.length + " друзей");
        murzic.friends[0].meow();



    }
}
