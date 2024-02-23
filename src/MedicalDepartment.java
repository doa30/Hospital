public class MedicalDepartment {
    private String department;
    private String hospital;
    private String doctor;

    public MedicalDepartment(String department, String hospital, String doctor)
    {
        this.department=department;
        this.hospital=hospital;
        this.doctor=doctor;
    }

    public String getDepartment() {return department; }
    public String getHospital() {return hospital; }
    public String getDoctor() {return doctor;}
    public void setDepartment(String department) {this.department=department;}
    public void setHospital(String hospital){this.hospital=hospital;}
    public void setDoctor(String doctor){this.doctor=doctor;}

    public void displayDepartmentInfo()
    {
        System.out.println("Hospital: "+getHospital()+"\n"+
                           "Medical Department: " + getDepartment()+"\n"+
                           "Doctor: "+getDoctor());
    }

}
