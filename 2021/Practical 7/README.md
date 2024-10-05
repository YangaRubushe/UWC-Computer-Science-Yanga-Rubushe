# Medical Practitioner and Vaccination System

## Project Overview
This project models a medical practitioner's ability to vaccinate patients. A practitioner can administer various vaccines, and each patient maintains a vaccination record that can be updated and reviewed.

## Features
- **Medical Practitioner**: A class representing a medical practitioner who can administer vaccines to patients.
- **Patient**: A class representing a patient, storing information about their vaccination history.
- **Person**: A base class for shared person details like name, ID number, and date of birth.
- **Vaccine Record**: Stores details about the vaccine type, batch code, and vaccination date.
- **Vaccine Types**: Includes different types of vaccines (Johnson & Johnson, AstraZeneca, Moderna, Pfizer).

## Class Structure
- `MedicalPractitioner`: Class responsible for vaccinating patients.
- `Patient`: Stores vaccination records for the patient.
- `Person`: Abstract class providing personal details for patients and practitioners.
- `VaccineRecord`: Stores information about each vaccination administered.
- `VaccineType`: Enum defining different types of vaccines.

## How to Run

1. Ensure you have all the necessary `.java` files:
   - `MainTest.java`
   - `MedicalPractitioner.java`
   - `Patient.java`
   - `Person.java`
   - `VaccineRecord.java`

2. Compile the project using the following command:
   ```bash
   javac *.java

## Example Output
Vaccine: PF, Batch: Batch001, Date: Sat Oct 05 12:30:45 SAST 2024
