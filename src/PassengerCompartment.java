class PassengerCompartment extends PlaneComponent {
  PassengerCompartment(String description) {
    super(description);
    inner = null;
  }

  @Override void check() {
    if (inner != null) {
      inner.check();
    }
    System.out.println("Passenger Compartment: " + getDescription());
    System.out.println("Passenger Compartment OK!");
  }
  @Override void process(Employee employee) {
    if (inner != null) {
      inner.process(employee);
    }
    super.process(employee);
    System.out.println("Passenger Compartment Processed!");
  }

  void setInner(PassengerCompartment inner) {
    this.inner = inner;
  }

  private PassengerCompartment inner;
}
