CLASS_NAME=GameBoard
PACKAGE=sokoban

TESTER=$(CLASS_NAME)Test
TESTED=$(CLASS_NAME)

TARGET_TESTER=$(TESTER).class
TARGET_TESTED=$(TESTED).class
TARGET=$(TARGET_TESTER) $(TARGET_TESTED)

BASE_TESTER=$(TESTER).java
BASE_TESTED=$(TESTED).java
BASE=$(BASE_TESTER) $(BASE_TESTED)

ifneq ($(PACKAGE),)
    JAVAFLAGS=-cp ..:/usr/share/java/junit.jar:/usr/share/java/hamcrest-core.jar
else
    JAVAFLAGS=-cp .:/usr/share/java/junit.jar:/usr/share/java/hamcrest-core.jar
endif

JUNIT_RUNNER=org.junit.runner.JUnitCore

all: $(TARGET)

clean:
	-rm $(TARGET) 

test: $(TARGET)
ifneq ($(PACKAGE),)
	java $(JAVAFLAGS) $(JUNIT_RUNNER) $(PACKAGE).$(TESTER)
else
	java $(JAVAFLAGS) $(JUNIT_RUNNER) $(TESTER)
endif

%.class: %.java
	javac $(JAVAFLAGS) $?
