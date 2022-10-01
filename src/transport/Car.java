package transport;

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

    public void printInformation() {
        System.out.println("Бренд автомобиля - " + brand + ", марка автомобиля - " + model + " " + productionYear
                + " года выпуска, собран в "
                + productionCountry + ", цвет автомобиля - " + color + ", объем двигателя - " + engineVolume
                + "л." );
    }
}
