package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car {
    static final String def = "'Не известна'";
    private String brand;
    private String model;
    private Float engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String numberRegistration;
    private Integer placesCount;
    private Boolean winterTires;
    private Key key;


    public static class Key {
        private boolean startEngineRemote;
        private boolean keylessEntry;

        public Key(boolean startEngineRemote, boolean keylessEntry) {
            this.startEngineRemote = startEngineRemote;
            this.keylessEntry = keylessEntry;
        }

        public boolean isStartEngineRemote() {
            return startEngineRemote;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }

    public  static class  Insurance {
        private final LocalDate validity;
        private final double price;
        private final String number;

        public Insurance(LocalDate validity, double price, String number) {
            this.validity = validity;
            if (validity.isBefore(LocalDate.now())){
                System.out.println("Страховка просрочена! Срочно оформите новую страховку!!!");
            }
            this.price = price;
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
            this.number = number;
        }

        public LocalDate getValidity() {
            return validity;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }
    }
    Car() {
    }

    public Car(String brand, String model, Float engineVolume, String color, Integer productionYear,
               String productionCountry, String transmission, String bodyType, String numberRegistration,
               Integer placesCount, Boolean winterTires) {
        this.brand = Objects.requireNonNullElse(brand, def);
        this.model = Objects.requireNonNullElse(model, def);
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 1.5f);
        this.color = Objects.requireNonNullElse(color, "white");
        this.productionYear = Objects.requireNonNullElse(productionYear, 2000);
        this.productionCountry = Objects.requireNonNullElse(productionCountry, def);
        this.transmission = Objects.requireNonNullElse(transmission, def);
        this.bodyType = Objects.requireNonNullElse(bodyType, def);
        this.numberRegistration = Objects.requireNonNullElse(numberRegistration, def);
        this.placesCount = (Integer) Objects.requireNonNullElse(placesCount, def);
        this.winterTires = winterTires;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public Integer getPlacesCount() {
        return placesCount;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getNumberRegistration() {
        return numberRegistration;
    }

    public void setNumberRegistration(String numberRegistration) {
        this.numberRegistration = numberRegistration;
    }

    public Boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(Boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = key;
        }
    }

    public void printInformation() {
        System.out.println("Бренд автомобиля - " + brand + ", марка автомобиля - " + model + " " + productionYear
                + " года выпуска, собран в "
                + productionCountry + ", цвет автомобиля - " + color + ", объем двигателя - " + engineVolume
                + "л.");
    }

    public void changeTire() {
        this.winterTires = !winterTires;
    }

    public void checkNumberRegistration(boolean winterTires) {
        if (numberRegistration.matches("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d")) {
            this.numberRegistration = numberRegistration;
        } else {
            this.numberRegistration = "Указан неверный регистрационный номер!";
        }
    }
}
