import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static int invalidCounter = 0;
    public static void main(String[] args) {
        boolean isTCKNValid;
        boolean isBirthDateValid;
        Scanner scanner = new Scanner(System.in);
        TCKNValidator validator = new TCKNValidator();

        String TCKN;

        do {
            System.out.print("Please enter your TCKN: ");
            TCKN = scanner.nextLine();
            isTCKNValid = validator.validateTCKN(TCKN);
            invalidCounter++;

            if (!isTCKNValid) {
                System.out.println("Invalid TCKN. Please try again. ");
            }

            if (invalidCounter == 3) {
                System.out.println("\nYou are blocked from the system due to entering a wrong TCKN. Please try again later.");
                System.exit(0);
            }
        } while (!isTCKNValid);

        System.out.print("Please enter your name: ");
        String Name = scanner.nextLine();
        System.out.print("Please enter your surname: ");
        String Surname = scanner.nextLine();

       LocalDate birthDate;

        do {
            System.out.print("Please enter your birthdate (yyyy-MM-dd): ");
            String BirthDate = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            birthDate = LocalDate.parse(BirthDate, formatter);
            BirthDateValidator birthDateValidator=new BirthDateValidator();
            isBirthDateValid=birthDateValidator.isDateValid(birthDate);

            if (!isBirthDateValid) {
                System.out.println("Invalid birthdate. Please try again. ");
            }

            if (invalidCounter == 3) {
                System.out.println("\nYou are blocked from the system due to entering a wrong birthdate. Please try again later.");
                System.exit(0);
            }
        } while (!isBirthDateValid);

        System.out.print("Please enter your Gender: ");
        String Gender = scanner.nextLine();
        System.out.print("Please enter your choice of hospital: ");
        String Hospital = scanner.nextLine();
        System.out.print("Please enter your choice of department: ");
        String Department = scanner.nextLine();
        System.out.print("Please enter your choice of doctor: ");
        String Doctor = scanner.nextLine();


        MedicalDepartment medicalDepartment=new MedicalDepartment(Department, Hospital, Doctor);

        Patient patient = new Patient(TCKN, Name, Surname, birthDate, Gender, medicalDepartment);

        patient.displayPatientInfo();
    }
}
