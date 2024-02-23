import java.time.LocalDate;

public class BirthDateValidator {
    public boolean isDateValid(LocalDate Date)
    {
        Patient patient=new Patient();
        if(patient.getAge()<0) return false;
        else return true;
    }
}
