### junit

Compile and run `SimpleTest.java` in the following way:

Windows:
```
javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar SimpleTest.java
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore SimpleTest
```

Linux:
```
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar SimpleTest.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore SimpleTest