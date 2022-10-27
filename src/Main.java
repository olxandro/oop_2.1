import transport.Car;

public class Main {

    public static void main(String[] args) {

        Human max = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human kate = new Human("Катя", "Калининград", 1994, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        max.Welcome();
        anya.Welcome();
        kate.Welcome();
        artem.Welcome();
        System.out.println();


        Car lada1 = new Car("Lada", "Grande", 1.7f, "yellow", 2015,
                "Russia", "Mechanic", "sedan", "q233AH327", 5, true);
        Car audi1 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "black", 2020,
                "Germany", "Automat", "sedan", "H456DG294", 5, true);
        Car bmw1 = new Car("BMW", "Z8", 3.0f, "black", 2021,
                "Germany", "Mechanic", "liftback", "j234d64", 5, false);
        Car kia1 = new Car("Kia", "Sportage 4 поколение", 2.4f, "red", 2018,
                "South Korea", "Automat", "minivan", "d283jf234", 7, true);
        Car hyundai1 = new Car("Hyundai", "Avante", 1.6f, "orange", 2016,
                "South Korea", "Automat", "sedan", "j234kj861", 5, false);

        lada1.printInformation();
        audi1.printInformation();
        bmw1.printInformation();
        kia1.printInformation();
        hyundai1.printInformation();
        System.out.println();

        Human vlad = new Human("Vladimir", "Kazan", 25, " ");
        vlad.Welcome();
        System.out.println();

        Flower[] bouquet = new Flower[10];
        Flower rose = new Flower("Rose", "", "Goland", 35.59f, 0);
        Flower chrysanthemum = new Flower("Chrysanthemum", "", "", 15.00f, 5);
        Flower piony = new Flower("Piony", "", " ", 69.9f, 1);
        Flower gypsophila = new Flower("Gypsophila", "", "Turkey", 19.5f, 10);

        rose.infoFlower();

        bouquet[0] = rose;
        bouquet[1] = piony;
        calculate(bouquet);

    }

    private static void calculate(Flower[] bouquet) {
        int lifeSpan = Integer.MAX_VALUE;
        double price = 0;
        String text = "В букете есть:\n";
        for (Flower flower : bouquet) {
            if (flower != null) {
                text += " " + flower.getName() + "\n";
                if (flower.getLifeSpan() < lifeSpan) {
                    lifeSpan = flower.getLifeSpan();
                }
                price += flower.getCost();
            }
        }
        price *= 1.1;
        text += "\n";
        text += "Стоимость букета - " + String.format("%.2f", price);
        text += "\n";
        text += "Срок годности: " + lifeSpan;
        System.out.println(text);

    }
}
