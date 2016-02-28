class Assign {
  public static void main(String[] args) {
    Plane plane = new Plane("747", "Boeing", 5);
    CleaningEmployee cleaningEmployee = new CleaningEmployee("");
    MaintenanceEmployee maintenanceEmployee = new MaintenanceEmployee("");
    SecurityEmployee securityEmployee = new SecurityEmployee("");

    plane.process(cleaningEmployee);
    cleaningEmployee.report();
    System.out.println();

    plane.process(maintenanceEmployee);
    maintenanceEmployee.report();
    System.out.println();

    plane.process(securityEmployee);
    securityEmployee.report();
    System.out.println();

    plane.check();
    System.out.println("Plane ready to take off!");
  }
}
