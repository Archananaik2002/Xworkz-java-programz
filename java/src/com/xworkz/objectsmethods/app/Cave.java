package com.xworkz.objectsmethods.app;

public class Cave {
	
	private String name;
    private double latitude;
    private double longitude;
    private int depthInMeters;
    private boolean inhabited;
    private String rockType;
    private int temperatureInCelsius;
    private int humidityPercentage;
    private boolean stalactitesPresent;
    private boolean stalagmitesPresent;
    public Cave() {
		// TODO Auto-generated constructor stub
	}
	public Cave(String name, double latitude, double longitude, int depthInMeters, boolean inhabited, String rockType,
			int temperatureInCelsius, int humidityPercentage, boolean stalactitesPresent, boolean stalagmitesPresent) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.depthInMeters = depthInMeters;
		this.inhabited = inhabited;
		this.rockType = rockType;
		this.temperatureInCelsius = temperatureInCelsius;
		this.humidityPercentage = humidityPercentage;
		this.stalactitesPresent = stalactitesPresent;
		this.stalagmitesPresent = stalagmitesPresent;
	}
	@Override
	public String toString() {
		return "name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + ", depthInMeters="
				+ depthInMeters + ", inhabited=" + inhabited + ", rockType=" + rockType + ", temperatureInCelsius="
				+ temperatureInCelsius + ", humidityPercentage=" + humidityPercentage + ", stalactitesPresent="
				+ stalactitesPresent + ", stalagmitesPresent=" + stalagmitesPresent ;
	}
    
	

}
