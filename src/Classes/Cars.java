package Classes;

public class Cars {

    public String make;
    private String model;
    private int year;
    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
