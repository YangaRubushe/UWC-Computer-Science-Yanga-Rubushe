//Author: Yanga Rubushe

import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
        // Create a MedicalPractitioner
        MedicalPractitioner practitioner = new MedicalPractitioner("12345", "Dr. Smith", new Date(), "LC1234");

        // Create a Patient
        Patient patient = new Patient("67890", "John Doe", new Date());

        // Vaccinate the patient
        practitioner.vaccinate(VaccineRecord.VaccineType.PF, "Batch001", patient);

        // Print the patient's vaccination records
        patient.printVaccinationRecords();
    }
}
