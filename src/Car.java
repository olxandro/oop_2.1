public class Car {
    static final String def = "'Не известна'";
    String brand;
    String model;
    Float engineVolume;
    String color;
    Integer productionYear;
    String productionCountry;

    Car() {
    }

    public Car(float engineVolume, String color, int productionYear) {
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.brand = def;
        this.model = def;
        this.productionCountry = def;
    }

    public Car(String brand, String model, Float engineVolume, String color, Integer productionYear,
               String productionCountry) {
        if (brand == null) {
            this.brand = def;
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = def;
        } else {
            this.model = model;
        }
        if (engineVolume == null) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }
        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = def;
        } else {
            this.productionCountry = productionCountry;
        }
    }

    public void printInformation() {
        System.out.println("Бренд автомобиля - " + brand + ", марка автомобиля - " + model + " " + productionYear
                + " года выпуска, собран в "
                + productionCountry + ", цвет автомобиля - " + color + ", объем двигателя - " + engineVolume
                + "л." );
    }
}
