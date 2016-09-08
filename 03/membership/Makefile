UNIT_TEST=MembershipTest

TARGET_TESTER=MembershipTest.class
TARGET_TESTED=Membership.class
TARGET=$(TARGET_TESTER) $(TARGET_TESTED)

BASE_TESTER=MembershipTest.java
BASE_TESTED=Membership.java
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
