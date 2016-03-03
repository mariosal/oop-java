class Assign {
  public static void main(String[] args) {
    Plane plane = new Plane("747", "Boeing", 200);
    CleaningEmployee cleaningEmployee = new CleaningEmployee("Carl");
    MaintenanceEmployee maintenanceEmployee = new MaintenanceEmployee("Fred");
    SecurityEmployee securityEmployee = new SecurityEmployee("Vlad");

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
