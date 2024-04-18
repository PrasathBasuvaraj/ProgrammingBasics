package overriding;

public class Movie {
    private String name;

    private int year;


    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void duration() {
        System.out.println("Movie is 150 minutes long");
    }


}
