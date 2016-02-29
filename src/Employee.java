abstract class Employee {
  Employee(String name) {
    this.name = name;
  }

  abstract void report();
  void work(PlaneComponent planeComponent) {
    this.planeComponent = planeComponent;
  }
  abstract boolean worksOnCargoBay();
  abstract boolean worksOnEquipmentCompartment();
  abstract boolean worksOnPassengerCompartment();

  private String name;
  private PlaneComponent planeComponent;
}
