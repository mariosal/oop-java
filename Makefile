CLASSES = build/Assign.class \
          build/CargoBay.class \
          build/CleaningEmployee.class \
          build/Employee.class \
          build/EquipmentCompartment.class \
          build/MaintenanceEmployee.class \
          build/PassengerCompartment.class \
          build/Plane.class \
          build/PlaneComponent.class \
          build/PrivateCompartment.class \
          build/SecurityEmployee.class

JC = javac
JFLAGS += -sourcepath src -cp build -d build

.PHONY = all clean
all : $(CLASSES)
clean :
	$(RM) -r build/*

build/%.class: src/%.java
	$(JC) $(JFLAGS) $^
