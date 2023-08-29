package models;

import java.util.Date;

public class Payment {

  String paymentReferenceNumber;
  int amount;
  PaymentMode paymentMode;
  PaymentStatus paymentStatus;
  Date time;

  public String getPaymentReferenceNumber() {
    return paymentReferenceNumber;
  }

  public void setPaymentReferenceNumber(String paymentReferenceNumber) {
    this.paymentReferenceNumber = paymentReferenceNumber;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public PaymentMode getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(PaymentMode paymentMode) {
    this.paymentMode = paymentMode;
  }

  public PaymentStatus getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }
}
