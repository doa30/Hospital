import java.time.LocalDate;

public class Patient {

    private String TCKN;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String gender;
    private MedicalDepartment medicalDepartment;

    public Patient(String TCKN, String name, String surname, LocalDate birthdate, String gender, MedicalDepartment medicalDepartment) {
        this.TCKN = TCKN;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.medicalDepartment = medicalDepartment;
    }

    public String getTCKN() {
        return TCKN;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthdate(){
        return birthdate;
    }

    public int getAge() {
        return findAge(birthdate);
    }

    public String getGender() {
        return gender;
    }

    public MedicalDepartment getMedicalDepartment() {
        return medicalDepartment;
    }

    public void setTCKN(String TCKN) {
        this.TCKN = TCKN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setAge(LocalDate birthdate) {
        int age = findAge(birthdate);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMedicalDepartment(MedicalDepartment medicalDepartment) {
        this.medicalDepartment = medicalDepartment;
    }

    private int findAge(LocalDate birthdate){
        int age=0;
        String [] date=birthdate.toString().split("-");
        int day= Integer.parseInt(date[2]);
        int month=Integer.parseInt(date[1]);
        int year=Integer.parseInt(date[0]);

        LocalDate currentDate = LocalDate.now();

        int currentday=currentDate.getDayOfMonth();
        int currentmonth= currentDate.getMonthValue();
        int currentyear=currentDate.getYear();

        if(currentyear>=year) {
            if (currentmonth < month) age = (currentyear - year) - 1;
            if (currentmonth > month) age = (currentyear - year);
            if (currentmonth == month) {
                if (currentday >= day) age = (currentyear - year);
                else age = (currentyear - year);
            }
        }
        else age=-1;
        return age;
    }
    public void displayPatientInfo() {
        System.out.println("Patient Information:");
        System.out.println("TCKN: " + TCKN);
        System.out.println("Name: " + name+" "+surname);
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + gender);
        medicalDepartment.displayDepartmentInfo();
    }

}

