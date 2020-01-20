The project created using maven project.
We have two type of test cases (Smoke and Functional) test cases.

you can run the test cases in two ways:

1-> First one by using an IDE:
    a- You need to install an IDE on your device for example 'eclipse'.
    b- You should have Java and maven installed on your system and configured using the environment variable.
    c- You need to import the project into the IDE as a maven project.
    d- To run the test cases you need to navigate to the path 'src/test/java/cucumber.Options/TestRunner' class.
    e- Run the project from this class as a juint run to execute the test cases

* inside the 'TestRunner' class you can uncomment the tag @smoke from the cucumber option to run the smoke test cases.

2-> Second one by using maven:
    a- You need to navigate to the project path using the command line.
    b- When you are on the main project directory you need to execute the following command
       -->  mvn test