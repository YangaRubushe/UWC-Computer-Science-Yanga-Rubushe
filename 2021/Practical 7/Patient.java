//Author: Yanga Rubushe
import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
    private ArrayList<VaccineRecord> vaccinationRecord;

    public Patient(String idNumber, String name, Date dateOfBirth) {
        super(idNumber, name, dateOfBirth);
        vaccinationRecord = new ArrayList<>();
    }

    public void addVaccineRecord(VaccineRecord record) {
        vaccinationRecord.add(record);
    }

    // Optional: To view the vaccination records
    public void printVaccinationRecords() {
        for (VaccineRecord record : vaccinationRecord) {
            System.out.println("Vaccine: " + record.getVaccineType() + ", Batch: " + record.getBatchCode() + ", Date: " + record.getDate());
        }
    }
}

