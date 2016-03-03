abstract class Employee {
  Employee(String name) {
    this.name = name;
    this.planeComponent = null;
  }

  abstract void report();
  void work(CargoBay cargoBay) {
    planeComponent = null;
  }
  void work(EquipmentCompartment equipmentCompartment) {
    planeComponent = null;
  }
  void work(PassengerCompartment passengerCompartment) {
    planeComponent = null;
  }

  void setPlaneComponent(PlaneComponent planeComponent) {
    this.planeComponent = planeComponent;
  }

  private String name;
  private PlaneComponent planeComponent;
}
