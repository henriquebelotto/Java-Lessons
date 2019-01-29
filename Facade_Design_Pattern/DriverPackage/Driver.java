package DriverPackage;

public class Driver {
    private int driverID;

    public Driver(int driverID) {
        this.driverID = driverID;
    }


    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver ID: " + Integer.toString(getDriverID());
    }
}
