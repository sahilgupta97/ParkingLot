package models;

public class Gate {

  int gateNumber;
  Operator operator;
  GateType gateType;
  GateStatus gateStatus;

  public int getGateNumber() {
    return gateNumber;
  }

  public void setGateNumber(int gateNumber) {
    this.gateNumber = gateNumber;
  }

  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  public GateType getGateType() {
    return gateType;
  }

  public void setGateType(GateType gateType) {
    this.gateType = gateType;
  }

  public GateStatus getGateStatus() {
    return gateStatus;
  }

  public void setGateStatus(GateStatus gateStatus) {
    this.gateStatus = gateStatus;
  }
}
