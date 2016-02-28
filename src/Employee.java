abstract class Employee {
  Employee(String name) {
    this.name = name;
  }

  abstract void report();
  void work(PlaneComponent planeComponent) {
    this.planeComponent = planeComponent;
  }

  private String name;
  private PlaneComponent planeComponent;
}
