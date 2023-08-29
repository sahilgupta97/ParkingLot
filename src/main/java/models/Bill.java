package models;

import java.util.Date;
import java.util.List;

public class Bill {

  Ticket ticket;
  Operator generatedBy;
  Date exitTime;
  int amount;

  String onlinePaymentLink;
  List<Payment> payments;
  BillStatus billStatus;

  public Ticket getTicket() {
    return ticket;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public Operator getGeneratedBy() {
    return generatedBy;
  }

  public void setGeneratedBy(Operator generatedBy) {
    this.generatedBy = generatedBy;
  }

  public Date getExitTime() {
    return exitTime;
  }

  public void setExitTime(Date exitTime) {
    this.exitTime = exitTime;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getOnlinePaymentLink() {
    return onlinePaymentLink;
  }

  public void setOnlinePaymentLink(String onlinePaymentLink) {
    this.onlinePaymentLink = onlinePaymentLink;
  }

  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public BillStatus getBillStatus() {
    return billStatus;
  }

  public void setBillStatus(BillStatus billStatus) {
    this.billStatus = billStatus;
  }
}