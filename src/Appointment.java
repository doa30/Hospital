import java.sql.Time;

public class Appointment {
    private Time Hour;
    private int Queue;
    private Prescription Prescription;

    private MedicalDepartment medicalDepartment;

    public Appointment(Time Hour, int Queue, Prescription Prescription, MedicalDepartment medicalDepartment)
    {
        this.Hour=Hour;
        this.Queue= Queue;
        this.Prescription= Prescription;
        this.medicalDepartment=medicalDepartment;
    }

    public MedicalDepartment getMedicalDepartment() {
        return medicalDepartment;
    }

    public Prescription getPrescription() {
        return Prescription;
    }

    public int getQueue() {
        return Queue;
    }

    public Time getHour() {
        return Hour;
    }

    public void setPrescription(Prescription prescription) {
        Prescription = prescription;
    }
    public void setHour(Time hour) {
        Hour = hour;
    }
    public void setQueue(int queue) {
        Queue = queue;
    }
    public void setMedicalDepartment(MedicalDepartment medicalDepartment) {
        this.medicalDepartment = medicalDepartment;
    }
}
