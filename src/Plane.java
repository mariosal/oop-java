import java.util.Random;

class Plane {
  Plane(String name, String description, int capacity) {
    this.capacity = capacity;
    this.description = description;
    this.name = name;
    cargoBay = new CargoBay("Cargo Bay #1");

    equipmentCompartments = new EquipmentCompartment[3];
    for (int i = 0; i < equipmentCompartments.length; ++i) {
      equipmentCompartments[i] = new EquipmentCompartment("Tech #" + (i + 1));
    }

    Random random = new Random();
    passengerCompartments = new PassengerCompartment[random.nextInt(capacity)
                                                     + 1];
    for (int i = 0; i < passengerCompartments.length; ++i) {
      passengerCompartments[i] = new PassengerCompartment(
          "Passenger Compartment #" + (i + 1));
      if (random.nextInt(2) == 1) {
        PassengerCompartment inner = new PassengerCompartment(
            "Inner Compartment");
        passengerCompartments[i].setInner(inner);
      }
    }
  }

  void check() {
    cargoBay.check();
    for (int i = 0; i < equipmentCompartments.length; ++i) {
      equipmentCompartments[i].check();
    }
    for (int i = 0; i < passengerCompartments.length; ++i) {
      passengerCompartments[i].check();
    }

    System.out.println("Plane: " + name + " - " + description);
    System.out.println("Plane OK!");
  }
  void process(Employee employee) {
    cargoBay.process(employee);
    for (int i = 0; i < equipmentCompartments.length; ++i) {
      equipmentCompartments[i].process(employee);
    }
    for (int i = 0; i < passengerCompartments.length; ++i) {
      passengerCompartments[i].process(employee);
    }
    System.out.println("Plane Processed!");
  }

  private int capacity;
  private CargoBay cargoBay;
  private String description;
  private EquipmentCompartment[] equipmentCompartments;
  private String name;
  private PassengerCompartment[] passengerCompartments;
}
