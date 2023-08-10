package com.xworkz.encapsulation.app;

public class Uber {
    
    protected String passengerName;
    protected String driverName;
    protected String sourceLocation;
    protected String destinationLocation;
    protected String rideDate;
    protected String pickupTime;
    protected String dropOffTime;
    protected String carModel;
    protected String licensePlate;
    protected double rideDistance;
    protected double rideFare;
    protected boolean isUberX;
    protected boolean isRideShared;
    protected boolean isDriverRated;

   

   
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getRideDate() {
        return rideDate;
    }

    public void setRideDate(String rideDate) {
        this.rideDate = rideDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(String dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getRideDistance() {
        return rideDistance;
    }

    public void setRideDistance(double rideDistance) {
        this.rideDistance = rideDistance;
    }

    public double getRideFare() {
        return rideFare;
    }

    public void setRideFare(double rideFare) {
        this.rideFare = rideFare;
    }

    public boolean isUberX() {
        return isUberX;
    }

    public void setUberX(boolean isUberX) {
        this.isUberX = isUberX;
    }

    public boolean isRideShared() {
        return isRideShared;
    }

    public void setRideShared(boolean isRideShared) {
        this.isRideShared = isRideShared;
    }

    public boolean isDriverRated() {
        return isDriverRated;
    }

    public void setDriverRated(boolean isDriverRated) {
        this.isDriverRated = isDriverRated;
    }

    
}
