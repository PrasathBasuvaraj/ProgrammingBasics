package Inheritance.Vehicle;

public class Result {

    public static void main(String[] args) {
        Honda myVehicle = new Honda();
        myVehicle.setHonda("activa");
        myVehicle.setElectricVehicle("Ether electric scooty");
        System.out.println(myVehicle.getElectricVehicle());
        System.out.println(myVehicle.getHonda() + "\n " + myVehicle.twowheeler + "\n" + myVehicle.city);
    }
}
