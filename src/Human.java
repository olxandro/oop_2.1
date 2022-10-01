import java.time.LocalDate;
import java.util.Locale;

public class Human {
    static final String def = "'Информация не указана'";
    String name;
    private String town;

    private Integer yearOfBurth;
    String job;

    Human() {
    }

    public Human(int yearOfBurth) {
        this.yearOfBurth = yearOfBurth;
        this.name = def;
        this.town = def;
        this.job = def;
    }

    Human(String name, String town, Integer yearOfBurth, String job) {
        this.setName(name);
        this.setTown(town);
        this.setYearOfBurth(yearOfBurth);
        this.setJob(job);
    }

    public void Welcome() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в "
                + yearOfBurth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = def;
        } else {
            this.name = name;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isBlank()) {
            this.town = def;
        } else {
            this.town = town.trim();
        }
    }

    public Integer getYearOfBurth() {
        return yearOfBurth;
    }

    public void setYearOfBurth(Integer yearOfBurth) {
        if (yearOfBurth == null || yearOfBurth >= 0) {
            this.yearOfBurth = yearOfBurth;
        } else {
            this.yearOfBurth = Math.abs(yearOfBurth);
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job == null) {
            this.job = def;
        } else {
            this.job = job;
        }
    }
}
