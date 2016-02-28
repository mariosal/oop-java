class MaintenanceEmployee extends Employee {
  MaintenanceEmployee(String name) {
    super(name);
  }

  @Override void report() {
    System.out.println("Maintenance report: Everything OK!");
  }
  @Override void work(PlaneComponent planeComponent) {
    super.work(planeComponent);
  }
}
