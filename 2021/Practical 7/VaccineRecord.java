//Author: Yanga Rubushe
import java.util.Date;

public class VaccineRecord {
    public enum VaccineType {
        JJ,  // Johnson & Johnson
        AZ,  // AstraZeneca
        MD,  // Moderna
        PF   // Pfizer
    }

    private VaccineType type;
    private String batchCode;
    private Date date;

    public VaccineRecord(VaccineType type, String batchCode) {
        this.type = type;
        this.batchCode = batchCode;
        this.date = new Date();  // Sets the vaccination date to the current date
    }

    public VaccineType getVaccineType() {
        return this.type;
    }

    public String getBatchCode() {
        return this.batchCode;
    }

    public Date getDate() {
        return this.date;
    }
}

