abstract class Employee {
  Employee(String name) {
    this.name = name;
  }

  abstract void report();
  void work(PlaneComponent planeComponent) {
  }
  abstract void work(CargoBay cargoBay);
  abstract void work(EquipmentCompartment equipmentCompartment);
  abstract void work(PassengerCompartment passengerCompartment);

  void setPlaneComponent(PlaneComponent planeComponent) {
    this.planeComponent = planeComponent;
  }

  private String name;
  private PlaneComponent planeComponent;
}
