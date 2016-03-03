class PassengerCompartment extends PlaneComponent {
  PassengerCompartment(String description) {
    super(description);
    inner = null;
  }

  @Override void check() {
    System.out.println("Passenger Compartment: " + getDescription());
    if (inner != null) {
      inner.check();
    }
    System.out.println("Passenger Compartment OK!");
  }
  @Override void process(Employee employee) {
    if (inner != null) {
      inner.process(employee);
    }
    employee.work(this);
  }

  void setInner(PassengerCompartment inner) {
    this.inner = inner;
  }

  private PassengerCompartment inner;
}
