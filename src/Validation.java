import java.time.LocalDate;

public class Validation {
    public boolean isDateValid(LocalDate Date)
    {
        Patient patient=new Patient();
        if(patient.getAge()<0) return false;
        else return true;
    }

    public boolean isGenderValid(String Gender)
    {
        Patient patient=new Patient();
        return true;
    }
}
