class CleaningEmployee extends Employee {
  CleaningEmployee(String name) {
    super(name);
  }

  @Override void report() {
    System.out.println("Cleaning report: Everything OK!");
  }
  @Override void work(PlaneComponent planeComponent) {
    super.work(planeComponent);
  }
  @Override boolean worksOnCargoBay() {
    return true;
  }
  @Override boolean worksOnEquipmentCompartment() {
    return false;
  }
  @Override boolean worksOnPassengerCompartment() {
    return true;
  }
}
