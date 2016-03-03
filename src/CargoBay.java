class CargoBay extends PrivateCompartment {
  CargoBay(String description) {
    super(description);
    inner = new EquipmentCompartment(description + " - Equipment");
  }

  @Override void check() {
    System.out.println("Cargo Bay: " + getDescription());
    inner.check();
    System.out.println("Cargo Bay OK!");
  }
  @Override void process(Employee employee) {
    inner.process(employee);
    employee.work(this);
  }

  private EquipmentCompartment inner;
}
