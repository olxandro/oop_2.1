public class Human {
    static final String def = "'Информация не указана'";
    String name;
    String town;

    int yearOfBurth;
    String job;

    Human() {
    }

    public Human(int yearOfBurth) {
        this.yearOfBurth = yearOfBurth;
        this.name = def;
        this.town = def;
        this.job = def;
    }

    Human(String name, String town, int yearOfBurth, String job) {
        if (name == null) {
            this.name = def;
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = def;
        } else {
            this.town = name;
        }
        if (yearOfBurth >= 0) {
            this.yearOfBurth = yearOfBurth;
        } else {
            this.yearOfBurth = 0;
        }
        if (job == null) {
            this.job = def;
        } else {
            this.job = job;
        }
    }

    public void Welcome() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в "
                + yearOfBurth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
