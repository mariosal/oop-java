class CleaningEmployee extends Employee {
  CleaningEmployee(String name) {
    super(name);
  }

  @Override void report() {
    System.out.println("Cleaning report: Everything OK!");
  }
  @Override void work(PlaneComponent planeComponent) {
    super.work(planeComponent);
  }
}
