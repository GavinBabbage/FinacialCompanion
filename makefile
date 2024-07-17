.PHONY: all clean run

# Define the main class here
MAIN_CLASS = Main.Driver

# Define the Java compiler and flags
JC = javac
JFLAGS = -g -d ./out -sourcepath ./src

# Define the Java runtime environment
JAVA = java

# List of all Java source files
SOURCES := $(shell find ./src -name '*.java')

# Default target
all: compile

compile: $(SOURCES)
	$(JC) $(JFLAGS) $(SOURCES)

run:
	$(JAVA) -classpath ./out $(MAIN_CLASS)

clean:
	rm -rf ./out/*

