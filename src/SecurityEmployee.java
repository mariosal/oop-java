class SecurityEmployee extends Employee {
  SecurityEmployee(String name) {
    super(name);
  }

  @Override void report() {
    System.out.println("Security report: Everything OK!");
  }
  @Override void work(PlaneComponent planeComponent) {
    super.work(planeComponent);
  }
  @Override boolean worksOnCargoBay() {
    return true;
  }
  @Override boolean worksOnEquipmentCompartment() {
    return true;
  }
  @Override boolean worksOnPassengerCompartment() {
    return true;
  }
}
