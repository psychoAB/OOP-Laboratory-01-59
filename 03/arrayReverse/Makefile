TESTER=ArrayReverseTest
TESTED=ArrayReverse

TARGET_TESTER=$(TESTER).class
TARGET_TESTED=$(TESTED).class
TARGET=$(TARGET_TESTER) $(TARGET_TESTED)

BASE_TESTER=$(TESTER).java
BASE_TESTED=$(TESTED).java
BASE=$(BASE_TESTER) $(BASE_TESTED)

JAVA_FLAG=-cp .:/usr/share/java/*
JUNIT_RUNNER=org.junit.runner.JUnitCore

all: $(TARGET)

clean:
	-rm $(TARGET) 

test: $(TARGET)
	java $(JAVA_FLAG) $(JUNIT_RUNNER) $(TESTER)

$(TARGET_TESTER): $(BASE_TESTER)
	javac $(JAVA_FLAG) $?

$(TARGET_TESTED): $(BASE_TESTED)
	javac $?
