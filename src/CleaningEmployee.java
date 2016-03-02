class CleaningEmployee extends Employee {
  CleaningEmployee(String name) {
    super(name);
  }

  @Override void report() {
    System.out.println("Cleaning report: Everything OK!");
  }
  @Override void work(CargoBay cargoBay) {
    setPlaneComponent(cargoBay);
    System.out.println("Cargo Bay Processed!");
    setPlaneComponent(null);
  }
  @Override void work(EquipmentCompartment equipmentCompartment) {
    setPlaneComponent(equipmentCompartment);
    System.out.println("Equipment Compartment Processed!");
    setPlaneComponent(null);
  }
  @Override void work(PassengerCompartment passengerCompartment) {
    setPlaneComponent(passengerCompartment);
    System.out.println("Passenger Compartment Processed!");
    setPlaneComponent(null);
  }
}
