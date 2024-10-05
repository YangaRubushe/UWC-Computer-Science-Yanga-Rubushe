//Author: Yanga Rubushe

import java.util.Date;

public class MedicalPractitioner {
    private String idNumber;
    private String name;
    private Date dateOfBirth;
    private String licenseCode;

    public MedicalPractitioner(String idNumber, String name, Date dateOfBirth, String licenseCode) {
        this.idNumber = idNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.licenseCode = licenseCode;
    }

    public void vaccinate(VaccineRecord.VaccineType vaccineType, String batchCode, Patient patient) {
        // Assuming vaccination means adding a VaccineRecord to the patient's record
        VaccineRecord record = new VaccineRecord(vaccineType, batchCode);
        patient.addVaccineRecord(record);  // Call a method on the patient to record the vaccination
    }
}
