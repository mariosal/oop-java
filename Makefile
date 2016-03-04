SRCS = src/Assign.java \
       src/CargoBay.java \
       src/CleaningEmployee.java \
       src/Employee.java \
       src/EquipmentCompartment.java \
       src/MaintenanceEmployee.java \
       src/PassengerCompartment.java \
       src/Plane.java \
       src/PlaneComponent.java \
       src/PrivateCompartment.java \
       src/SecurityEmployee.java

JC = javac
JFLAGS += -sourcepath src -cp build -d build

.PHONY = all clean
all : build/Assign.class
clean :
	$(RM) -r build/*

build/Assign.class: $(SRCS)
	$(JC) $(JFLAGS) $^
