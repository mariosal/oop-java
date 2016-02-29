class EquipmentCompartment extends PrivateCompartment {
  EquipmentCompartment(String description) {
    super(description);
  }

  @Override void check() {
    System.out.println("Equipment Compartment: " + getDescription());
    System.out.println("Equipment Compartment OK!");
  }
  @Override void process(Employee employee) {
    if (!employee.worksOnEquipmentCompartment()) {
      return;
    }
    super.process(employee);
    System.out.println("Equipment Compartment Processed!");
  }
}
