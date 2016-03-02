class PrivateCompartment extends PlaneComponent {
  PrivateCompartment(String description) {
    super(description);
  }

  @Override void check() {
    System.out.println("Private Compartment: " + getDescription());
    System.out.println("Private Compartment OK!");
  }
  @Override void process(Employee employee) {
    employee.work(this);
  }
}
