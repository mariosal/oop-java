class SecurityEmployee extends Employee {
  SecurityEmployee(String name) {
    super(name);
  }

  @Override void report() {
    System.out.println("Security report: Everything OK!");
  }
  @Override void work(PlaneComponent planeComponent) {
    super.work(planeComponent);
  }
}
