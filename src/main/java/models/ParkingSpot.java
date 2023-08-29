package models;

import java.util.List;

public class ParkingSpot {

  int parkingSpotNumber;
  List<VehicleType> supportedVehicles;
  Vehicle vehicle;
  ParkingSpotStatus parkingSpotStatus;

  public int getParkingSpotNumber() {
    return parkingSpotNumber;
  }

  public void setParkingSpotNumber(int parkingSpotNumber) {
    this.parkingSpotNumber = parkingSpotNumber;
  }

  public List<VehicleType> getSupportedVehicles() {
    return supportedVehicles;
  }

  public void setSupportedVehicles(List<VehicleType> supportedVehicles) {
    this.supportedVehicles = supportedVehicles;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public ParkingSpotStatus getParkingSpotStatus() {
    return parkingSpotStatus;
  }

  public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
    this.parkingSpotStatus = parkingSpotStatus;
  }
}
