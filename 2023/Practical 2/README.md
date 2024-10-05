# Java Assignment - Task 1

## Overview
This project consists of two main tasks implemented in Java. The first task involves verifying the validity of passwords based on specific criteria, while the second task involves reading from a file and writing formatted content to a new file.

## Task 1: Password Verification (Practical11)
### Description
The `Practical11` class contains a method to verify if a given password meets the following criteria:
- At least 8 characters long
- Contains at least one lowercase letter
- Contains at least one uppercase letter
- Contains at least one digit
- Contains at least one special character

### How to Run
1. Compile the `mainP11.java` file:
   ```bash
   javac mainP11.java
   ```
2. Run the compiled class:
   ```bash
   java mainP11
   ```
3. Follow the prompt to enter a password for verification.

### Example Usage

Please enter the password: Abcdef1$


## Task 2: File Read and Write (Practical12)
### Description
The `Practical12` class reads lines from an input file (`Rhyme.txt`), formats them, and writes them to an output file (`Rhyme2.txt`). It also appends the author's name and student number at the end of the output file.

### How to Run
1. Compile the `mainP12.java` file:
   ```bash
   javac mainP12.java
   ```
2. Run the compiled class:
   ```bash
   java mainP12
   ```
3. Ensure that the `Rhyme.txt` file is present in the same directory for the program to read from.

### Example Output
The output will be written to `Rhyme2.txt` in the following format:

[0][0] To UWC computer science year two,

[0][1] Congratulations, hats off to you!

## Notes
- Ensure that you have Java installed on your machine to compile and run the code.
- Modify the `Rhyme.txt` file as needed to test different inputs for the file reading task.
