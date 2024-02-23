public class Prescription {
    private String Medicine;
    private String Diagnosis;

    public Prescription(String Medicine, String Diagnosis)
    {
        this.Diagnosis=Diagnosis;
        this.Medicine=Medicine;
    }

    public Prescription(){}
    public String getMedicine() {
        return Medicine;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public void setMedicine(String medicine) {
        Medicine = medicine;
    }


}
