package Classes;

public class MainCars {
    public static void main(String[] args) {
        Cars myCar = new Cars("Toyota", "Corolla", 2020);
        System.out.println("Car Make: " + myCar.make);
        myCar.make = "Honda";
        myCar.setModel("Civic");
        myCar.setYear(2022);
        System.out.println("Car Make: " + myCar.getModel());
        System.out.println("Car Make: " + myCar.getYear());

    }

}
