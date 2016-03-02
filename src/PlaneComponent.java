abstract class PlaneComponent {
  PlaneComponent(String description) {
    this.description = description;
  }

  abstract void check();
  abstract void process(Employee employee);

  String getDescription() {
    return description;
  }

  private String description;
}
