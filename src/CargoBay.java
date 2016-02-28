class CargoBay extends PrivateCompartment {
  CargoBay(String description) {
    super(description);
    equipmentCompartment = new EquipmentCompartment(description + " - Equipment");
  }

  @Override void check() {
    equipmentCompartment.check();
    System.out.println("Cargo Bay: " + getDescription());
    System.out.println("Cargo Bay OK!");
  }
  @Override void process(Employee employee) {
    equipmentCompartment.process(employee);
    super.process(employee);
    System.out.println("Cargo Bay Processed!");
  }

  private EquipmentCompartment equipmentCompartment;
}
