package com.xworkz.encapsulation.app;

public class NammaMetro {
    
    protected String passengerName;
    protected String metroOperator;
    protected String sourceStation;
    protected String destinationStation;
    protected String travelDate;
    protected String entryTime;
    protected String exitTime;
    protected String coachNumber;
    protected int seatNumber;
    protected double fareAmount;
    protected boolean isPeakHour;
    protected boolean isRoundTrip;
    protected boolean isPassengerRated;

  
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getMetroOperator() {
        return metroOperator;
    }

    public void setMetroOperator(String metroOperator) {
        this.metroOperator = metroOperator;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    public String getCoachNumber() {
        return coachNumber;
    }

    public void setCoachNumber(String coachNumber) {
        this.coachNumber = coachNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(double fareAmount) {
        this.fareAmount = fareAmount;
    }

    public boolean isPeakHour() {
        return isPeakHour;
    }

    public void setPeakHour(boolean isPeakHour) {
        this.isPeakHour = isPeakHour;
    }

    public boolean isRoundTrip() {
        return isRoundTrip;
    }

    public void setRoundTrip(boolean isRoundTrip) {
        this.isRoundTrip = isRoundTrip;
    }

    public boolean isPassengerRated() {
        return isPassengerRated;
    }

    public void setPassengerRated(boolean isPassengerRated) {
        this.isPassengerRated = isPassengerRated;
    }

    
}
