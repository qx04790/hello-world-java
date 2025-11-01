# Hello World Java Application

A simple Java application demonstrating a basic Gradle project setup with JUnit 5 tests.

## Prerequisites

- Java 21 or later
- Gradle (wrapper included)

## Building the Application

To build the application:

```bash
./gradlew build
```

## Running Tests

To run the tests:

```bash
./gradlew test
```

## Running the Application

There are two ways to run the application:

1. Using Gradle's application plugin:
```bash
./gradlew run
```

2. Using the JAR file (after building):
```bash
java -jar build/libs/hello-world-0.1.0-SNAPSHOT.jar
```

## Project Structure

- `src/main/java/com/example/helloworld/App.java` - Main application class
- `src/test/java/com/example/helloworld/AppTest.java` - Test class
- `build.gradle` - Gradle build configuration
