package models;

import java.util.Date;

public class Ticket {

  String ticketNumber;
  Vehicle vehicle;
  ParkingSpot assignedSpot;
  Operator generatedBy;
  Gate generatedAt;
  Date entryTime;

  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public ParkingSpot getAssignedSpot() {
    return assignedSpot;
  }

  public void setAssignedSpot(ParkingSpot assignedSpot) {
    this.assignedSpot = assignedSpot;
  }

  public Operator getGeneratedBy() {
    return generatedBy;
  }

  public void setGeneratedBy(Operator generatedBy) {
    this.generatedBy = generatedBy;
  }

  public Gate getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(Gate generatedAt) {
    this.generatedAt = generatedAt;
  }

  public Date getEntryTime() {
    return entryTime;
  }

  public void setEntryTime(Date entryTime) {
    this.entryTime = entryTime;
  }
}
