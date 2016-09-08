UNIT_TEST=Median3Test

TARGET_TESTER=Median3Test.class
TARGET_TESTED=Median3.class
TARGET=$(TARGET_TESTER) $(TARGET_TESTED)

BASE_TESTER=Median3Test.java
BASE_TESTED=Median3.java
BASE=$(BASE_TESTER) $(BASE_TESTED)

JAVA_FLAG=-cp .:/usr/share/java/*
JUNIT_RUNNER=org.junit.runner.JUnitCore

all: $(TARGET)

clean:
	-rm $(TARGET) 

test: $(TARGET)
	java $(JAVA_FLAG) $(JUNIT_RUNNER) $(UNIT_TEST)

$(TARGET_TESTER): $(BASE_TESTER)
	javac $(JAVA_FLAG) $?

$(TARGET_TESTED): $(BASE_TESTED)
	javac $?
