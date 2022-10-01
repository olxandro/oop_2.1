public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private float cost;
    private Integer lifeSpan;

    public Flower(String name, String flowerColor, String country, float cost, Integer lifeSpan) {
        this.name = name;
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()){
            this.flowerColor = "white";
        } else {
            this.flowerColor = flowerColor;
        }
        if (flowerColor == null || country.isBlank() || country.isEmpty()) {
            this.country = "Russia";
        } else {
            this.country = country;
        }
        if (cost > 0.00f) {
            this.cost = cost;
        } else {
            this.cost = 1.00f;
        }
        if (lifeSpan > 0 ) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void infoFlower() {
        System.out.println( "Цветок: " + " " + "Название - " + name +
                ", цвет - " + flowerColor +
                ", страна происхождения - " + country +
                ", стоимость цветка - " + cost +
                "р., Срок стояния - " + lifeSpan +
                " дней.");
    }
}
