abstract class PlaneComponent {
  PlaneComponent(String description) {
    this.description = description;
  }

  abstract void check();
  void process(Employee employee) {
    employee.work(this);
  }

  String getDescription() {
    return description;
  }

  private String description;
}
